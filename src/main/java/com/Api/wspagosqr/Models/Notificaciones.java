package com.Api.wspagosqr.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "notificaciones")
public class Notificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private boolean finalizado;
    private String fuente;
    private String estado;
    private String codigoSeguimiento;
    private String fecha;
    private String mensaje;
    private ProcesoPago detalle;

    public Notificaciones(long id, boolean finalizado, String fuente, String estado, String codigoSeguimiento, String fecha, String mensaje, ProcesoPago detalle) {
        this.id = id;
        this.finalizado = finalizado;
        this.fuente = fuente;
        this.estado = estado;
        this.codigoSeguimiento = codigoSeguimiento;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.detalle = detalle;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ProcesoPago getDetalle() {
        return detalle;
    }

    public void setDetalle(ProcesoPago detalle) {
        this.detalle = detalle;
    }
}

