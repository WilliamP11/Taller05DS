package com.example;

import java.util.List;

public class Estudiante  extends PersonalAcademico {
    private List<Curso> estudiantesInscritos;
    private List<Curso> estudiantesEnEsperaDeInscripcion;

    

    public Estudiante(List<Curso> estudiantesInscritos, List<Curso> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    
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
