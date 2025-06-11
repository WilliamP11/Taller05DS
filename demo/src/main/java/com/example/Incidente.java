package com.example;

import java.sql.Date;
import java.util.List;

public class Incidente {
    private int id;
    private Date fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private Date fechaCerrado;
    private String tipo;

    public Incidente(int id, Date fechaReportado, String estado, String titulo, String descripcion,
            List<String> logActualizaciones, Date fechaCerrado, String tipo) {
        this.id = id;
        this.fechaReportado = fechaReportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logActualizaciones = logActualizaciones;
        this.fechaCerrado = fechaCerrado;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaReportado() {
        return fechaReportado;
    }

    public void setFechaReportado(Date fechaReportado) {
        this.fechaReportado = fechaReportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getLogActualizaciones() {
        return logActualizaciones;
    }

    public void setLogActualizaciones(List<String> logActualizaciones) {
        this.logActualizaciones = logActualizaciones;
    }

    public Date getFechaCerrado() {
        return fechaCerrado;
    }

    public void setFechaCerrado(Date fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

