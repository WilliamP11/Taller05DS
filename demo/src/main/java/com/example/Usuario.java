package com.example;

import java.util.ArrayList;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    public Usuario(String usuario, String contraseña, String nombre, String apellido, ArrayList<Incidente> incidentes) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentes = incidentes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public boolean login() {
        return true;
    }

    public boolean logout() {
        return true;
    }

}
