package com.example;

import java.util.ArrayList;

public class SoporteTecnico extends Usuario {

    
    public SoporteTecnico(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
    }
    
    public void brindarAsistencia(Usuario usuario) {}
    public void resolverProblemaTecnico(Usuario usuario) {}
    public void derivarProblemaDeGestion(Administrador administrador) {}

}
