package com.example.porfolio.model;

public class Contacto {
   
	private String asunto;
    private String email;
    private String mensaje;

    
    public Contacto() {
        super();
    }

    public Contacto(String asunto, String email, String mensaje) {
        this.asunto = asunto;
        this.email = email;
        this.mensaje = mensaje;
    }

    
    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
