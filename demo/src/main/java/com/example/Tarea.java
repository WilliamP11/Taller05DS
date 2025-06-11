package com.example;

import java.sql.Date;

public class Tarea extends ActividadSumativa {
    public Tarea(String titulo, Date fechaLimite, float puntajeMaximo, float puntuacionEstudiante, float calificacion,
            String id) {
        super(titulo, fechaLimite, puntajeMaximo, puntuacionEstudiante, calificacion, id);
    }

    private Date fechaDePublicacion;

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

}
