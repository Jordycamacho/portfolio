package com.example.porfolio.model;


public class Contacto {

	private String nombre;
    private String email;
    private String mensaje;
    private String asunto;
    
    public Contacto() {
        super();
    }

    public Contacto( String nombre, String email, String mensaje,String asunto) {

        this.nombre = nombre;
        this.email = email;
        this.mensaje = mensaje;
        this.asunto = asunto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

}
