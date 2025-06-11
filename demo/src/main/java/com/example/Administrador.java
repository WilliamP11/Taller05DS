package com.example;

import java.util.ArrayList;

public class Administrador extends Usuario {
    public Administrador(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
    }

    public void crearUsuarioConRol(Usuario usuario, String contraseña) {
    }

    public void asignarPermiso(Usuario usuario, String permiso) {
    }

    public void actualizarSoftware() {
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
    }

}
