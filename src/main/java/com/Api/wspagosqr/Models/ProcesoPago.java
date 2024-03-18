package com.Api.wspagosqr.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "procesoPago")
public class ProcesoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descripcion;
    private String codigoOrden;
    private DatosPago datosPago;

    public ProcesoPago(long id, String descripcion, String codigoOrden, DatosPago datosPago) {
        this.id = id;
        this.descripcion = descripcion;
        this.codigoOrden = codigoOrden;
        this.datosPago = datosPago;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(String codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public DatosPago getDatosPago() {
        return datosPago;
    }

    public void setDatosPago(DatosPago datosPago) {
        this.datosPago = datosPago;
    }
}
