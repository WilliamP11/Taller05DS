package com.example;
import java.util.ArrayList;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    public boolean login() {
        return true;
    }

    public boolean logout() {
        return true;
    }

}
