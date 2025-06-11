package com.example;

import java.sql.Date;

public class ActividadSumativa {
 private String titulo;
    private Date fechaLimite;
    private float puntajeMaximo;
    private float puntuacionEstudiante;
    private float calificacion;
    private String id;
    
    public ActividadSumativa(String titulo, Date fechaLimite, float puntajeMaximo, float puntuacionEstudiante,
            float calificacion, String id) {
        this.titulo = titulo;
        this.fechaLimite = fechaLimite;
        this.puntajeMaximo = puntajeMaximo;
        this.puntuacionEstudiante = puntuacionEstudiante;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public float getPuntuacionEstudiante() {
        return puntuacionEstudiante;
    }

    public void setPuntuacionEstudiante(float puntuacionEstudiante) {
        this.puntuacionEstudiante = puntuacionEstudiante;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

}
