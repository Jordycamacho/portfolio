package com.example.porfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/")
public class UsuarioController {
    
    @GetMapping("/inicio")
    public String inicio(){

        return "usuario/index";
    }

    @PostMapping("/enviar")
    public String contacto(){

        return "";
    }
    
}
