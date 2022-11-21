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
    private ArrayList<String> cuentas;
    private ArrayList<String> tarjetas;

    // contructor por defecto
    public Cliente(){
        
    }
    public Cliente(String nombre, String idCliente, String pinCuenta, String pinTransferencia, ArrayList<String> cuentas, ArrayList<String> tarjetas) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.pinCuenta = pinCuenta;
        this.pinTransferencia = pinTransferencia;
        this.cuentas = cuentas;
        this.tarjetas = tarjetas;
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

    public ArrayList<String> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<String> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<String> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<String> tarjetas) {
        this.tarjetas = tarjetas;
    }
    
}
