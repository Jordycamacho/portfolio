package com.example.porfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements IEmailService {

    @Value("${email.sender}")
    private String myEmail;

    @Autowired
    private JavaMailSender mailSender;

    @Override
public void sendEmailContact(String[] correoU, String asunto, String correo,  String mensaje) {
    String formattedMessage = "Enviado por: " + correo  + "\nAsunto: " + asunto + "\nMensaje: " + mensaje;

    SimpleMailMessage mailMessage = new SimpleMailMessage();

    mailMessage.setFrom(myEmail);
    mailMessage.setTo(correoU);
    mailMessage.setSubject(mensaje);
    mailMessage.setText(formattedMessage);

    mailSender.send(mailMessage);
}
}
