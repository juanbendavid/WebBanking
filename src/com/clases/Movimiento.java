package com.clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */
public class Movimiento {
    private int tipo;
    private int monto;
    private String idMovimiento;
    private String destinatario;
    private String origen;
    private String hora;
    private String fecha;

    public Movimiento(int tipo, int monto, String destinatario, String origen, String hora, String fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.destinatario = destinatario;
        this.origen = origen;
        this.hora = hora;
        this.fecha = fecha;
    }
     public Movimiento(int tipo, int monto, String origen, String hora, String fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.origen = origen;
        this.hora = hora;
        this.fecha = fecha;
    }
    
    public Movimiento(int tipo, int monto, String idMovimiento, String destinatario, String remitente, String hora, String fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.idMovimiento = idMovimiento;
        this.destinatario = destinatario;
        this.origen = remitente;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return origen;
    }

    public void setRemitente(String origen) {
        this.origen = origen;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "Tipo: "+this.tipo+
                "\nMonto: "+this.monto+
                "\nDestinatario: "+this.destinatario+"\tOrigen "+this.origen+
                "\nHora: "+this.hora+"\tFecha: "+this.fecha;
    }
}
