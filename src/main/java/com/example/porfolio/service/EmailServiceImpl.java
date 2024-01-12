package com.example.porfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailServiceImpl implements IEmailService{

    @Value("${email.sender}") 
    private String myEmail;
 
    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String[] correoU, String asunto, String mensage) {
       
        SimpleMailMessage mailMessage = new SimpleMailMessage();
       
        mailMessage.setFrom(myEmail);
        mailMessage.setTo(correoU);
        mailMessage.setSubject(asunto);
        mailMessage.setText(mensage);
        mailSender.send(mailMessage);
    }

}
