package com.example;

import java.util.List;

public class Estudiante  extends PersonalAcademico {
    private List<Curso> estudiantesInscritos;
    private List<Curso> estudiantesEnEsperaDeInscripcion;

    public void solicitarInscripcionCurso(Curso curso) {}
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {}
}
