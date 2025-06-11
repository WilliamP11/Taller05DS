package com.example;

import java.sql.Date;

public class Evaluacion extends ActividadSumativa {
    public Evaluacion(String titulo, Date fechaLimite, float puntajeMaximo, float puntuacionEstudiante,
            float calificacion, String id) {
        super(titulo, fechaLimite, puntajeMaximo, puntuacionEstudiante, calificacion, id);
    }

    private int limiteDeTiempo;

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }

    
}
