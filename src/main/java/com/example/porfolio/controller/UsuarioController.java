package com.example.porfolio.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.porfolio.model.Contacto;
import com.example.porfolio.service.IEmailService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/")
public class UsuarioController {

    @Value("${email.sender}")
    private String myEmail;

    @Autowired
    private IEmailService emailService;

    @GetMapping("/inicio")
    public String inicio() {

        return "usuario/index";
    }

    @PostMapping("/inicio/enviar")
    public String save(Contacto contacto, Model model) {

        String mycorreo = "jordycamacho225@gmail.com";

        try {
            String[] destinatarios = { mycorreo };

            String correo = contacto.getEmail();
            String asunto = contacto.getAsunto();
            String mensaje = contacto.getMensaje();
            
            emailService.sendEmailContact(destinatarios, asunto, correo, mensaje);

            model.addAttribute("mensajeEnviado", true);
        } catch (Exception e) {

            model.addAttribute("mensajeEnviado", false);
        }

        return"redirect:/inicio";
    }
}
