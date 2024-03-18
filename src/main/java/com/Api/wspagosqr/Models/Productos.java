package com.Api.wspagosqr.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String actividadEconomica;
    private String codigo;
    private String codigoSin;
    private String descripcion;
    private Float precioUnitario;
    private Integer unidadMedida;
    private Float montoDescuento;
    private Integer cantidad;


    public Productos(Long id, String actividadEconomica, String codigo, String codigoSin, String descripcion, Float precioUnitario, Integer unidadMedida, Float montoDescuento, Integer cantidad) {
        this.id = id;
        this.actividadEconomica = actividadEconomica;
        this.codigo = codigo;
        this.codigoSin = codigoSin;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidadMedida = unidadMedida;
        this.montoDescuento = montoDescuento;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoSin() {
        return codigoSin;
    }

    public void setCodigoSin(String codigoSin) {
        this.codigoSin = codigoSin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Float getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(Float montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
