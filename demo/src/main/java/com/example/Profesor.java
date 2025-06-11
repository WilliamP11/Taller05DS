package com.example;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends PersonalAcademico {


    public Profesor(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
    }

    private List<Curso> cursosACargo;

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {
    }

    public void aceptarInscripcion(Curso curso, Estudiante estudiante) {
    }

    public void crearNuevoForo(Foro foro) {
    }

    public List<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(List<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
}
