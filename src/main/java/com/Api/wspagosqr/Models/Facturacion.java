package com.Api.wspagosqr.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String municipio;
    private String departamento;
    private String telefono;
    private String razonSocial;
    private Integer tipoDocumentoIdentidad;
    private String DocumentoIdentidad;
    private String complemento;
    private Float montoTotal;
    private Float montoDescuentoAdicional;
    private Float tipoCambio;
    private Integer documentoSector;

    public Facturacion(Long id, String municipio, String departamento, String telefono, String razonSocial, Integer tipoDocumentoIdentidad, String documentoIdentidad, String complemento, Float montoTotal, Float montoDescuentoAdicional, Float tipoCambio, Integer documentoSector) {
        this.id = id;
        this.municipio = municipio;
        this.departamento = departamento;
        this.telefono = telefono;
        this.razonSocial = razonSocial;
        this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
        DocumentoIdentidad = documentoIdentidad;
        this.complemento = complemento;
        this.montoTotal = montoTotal;
        this.montoDescuentoAdicional = montoDescuentoAdicional;
        this.tipoCambio = tipoCambio;
        this.documentoSector = documentoSector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    public void setTipoDocumentoIdentidad(Integer tipoDocumentoIdentidad) {
        this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
    }

    public String getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        DocumentoIdentidad = documentoIdentidad;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Float getMontoDescuentoAdicional() {
        return montoDescuentoAdicional;
    }

    public void setMontoDescuentoAdicional(Float montoDescuentoAdicional) {
        this.montoDescuentoAdicional = montoDescuentoAdicional;
    }

    public Float getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Float tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Integer getDocumentoSector() {
        return documentoSector;
    }

    public void setDocumentoSector(Integer documentoSector) {
        this.documentoSector = documentoSector;
    }
}
