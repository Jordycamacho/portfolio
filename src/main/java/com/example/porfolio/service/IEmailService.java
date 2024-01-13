package com.example.porfolio.service;

public interface IEmailService {
    
    void sendEmailContact(String[] correoU, String correo, String asunto, String mensaje);

}