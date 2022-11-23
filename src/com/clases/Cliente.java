package com.clases;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Cliente {

    private String nombre;
    private String idCliente;
    private String pinCuenta;
    private String pinTransferencia;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Servicio> servicios;

    // contructor por defecto
    public Cliente() {
        this.cuentas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }
    public Cliente(String nombre, String idCliente, String pinCuenta, ArrayList<Cuenta> cuentas, ArrayList<Tarjeta> tarjetas) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.pinCuenta = pinCuenta;
        this.cuentas = cuentas;
        this.tarjetas = tarjetas;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getPinCuenta() {
        return pinCuenta;
    }

    public void setPinCuenta(String pinCuenta) {
        this.pinCuenta = pinCuenta;
    }

    public String getPinTransferencia() {
        return pinTransferencia;
    }

    public void setPinTransferencia(String pinTransferencia) {
        this.pinTransferencia = pinTransferencia;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

}
