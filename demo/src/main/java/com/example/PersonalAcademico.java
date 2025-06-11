package com.example;

import java.util.ArrayList;

public class PersonalAcademico extends Usuario {

    protected ArrayList<Incidente> incidentes;

    public PersonalAcademico(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public void reportarError(String email, String contenido) {
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
    }

    public void comentarEnForo(Foro foro, String comentario) {
    }

    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
}
