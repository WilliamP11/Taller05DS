package com.example;

import java.util.ArrayList;
import java.util.List;

public class Estudiante  extends PersonalAcademico {

    public Estudiante(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidentes) {
        super(usuario, contraseña, nombre, apellido, incidentes);
    }
    private List<Curso> estudiantesInscritos;
    private List<Curso> estudiantesEnEsperaDeInscripcion;


    
    public List<Curso> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }


    public void setEstudiantesInscritos(List<Curso> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }


    public List<Curso> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }


    public void setEstudiantesEnEsperaDeInscripcion(List<Curso> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }


    public void solicitarInscripcionCurso(Curso curso) {}
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {}
}
