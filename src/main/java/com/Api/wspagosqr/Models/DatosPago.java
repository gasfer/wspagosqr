package com.Api.wspagosqr.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "datosProducto")
public class DatosPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nombresCliente;
    private  String numeroDocumentoCliente;
    private  Integer tipoDocumentoCliente;
    private  String fechaNacimientoCliente;
    private  String cuentaBancaria;
    private  Float montoTotal;
    private  String moneda;
    private  Integer tipoCambioMoneda;

    public DatosPago(Long id, String nombresCliente, String numeroDocumentoCliente, Integer tipoDocumentoCliente, String fechaNacimientoCliente, String cuentaBancaria, Float montoTotal, String moneda, Integer tipoCambioMoneda) {
        this.id = id;
        this.nombresCliente = nombresCliente;
        this.numeroDocumentoCliente = numeroDocumentoCliente;
        this.tipoDocumentoCliente = tipoDocumentoCliente;
        this.fechaNacimientoCliente = fechaNacimientoCliente;
        this.cuentaBancaria = cuentaBancaria;
        this.montoTotal = montoTotal;
        this.moneda = moneda;
        this.tipoCambioMoneda = tipoCambioMoneda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }

    public Integer getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public void setTipoDocumentoCliente(Integer tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }

    public String getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(String fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Integer getTipoCambioMoneda() {
        return tipoCambioMoneda;
    }

    public void setTipoCambioMoneda(Integer tipoCambioMoneda) {
        this.tipoCambioMoneda = tipoCambioMoneda;
    }
}
