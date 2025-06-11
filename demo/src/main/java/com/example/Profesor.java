package com.example;

import java.util.List;

public class Profesor extends PersonalAcademico{
    private List<Curso> cursosACargo;

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {}
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {}
    public void aceptarInscripcion(Curso curso, Estudiante estudiante) {}
    public void crearNuevoForo(Foro foro) {}
}
