package com.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<ActividadSumativa> actividadesSumativas;
    private Estudiante estudiante;
    private Profesor profesor;
    private ArrayList<Foro> foros;
    public Curso(String id, String nombre, boolean estadoDisponible, List<ActividadSumativa> actividadesSumativas,
            Estudiante estudiante, Profesor profesor, ArrayList<Foro> foros) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.actividadesSumativas = actividadesSumativas;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.foros = foros;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }
    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }
    public List<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }
    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public ArrayList<Foro> getForos() {
        return foros;
    }
    public void setForos(ArrayList<Foro> foros) {
        this.foros = foros;
    }

}
