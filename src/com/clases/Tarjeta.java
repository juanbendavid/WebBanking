package com.clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */
public class Tarjeta {
    private String idTarjeta;
    private int deuda;
    private int saldo;

    public Tarjeta(String idTarjeta, int deuda, int saldo) {
        this.idTarjeta = idTarjeta;
        this.deuda = deuda;
        this.saldo = saldo;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void aumentarSaldo(int monto){
        this.saldo+=monto;
    }
    
    public void aumentarDeuda(int monto){
        this.deuda+=deuda;
    }
    
    public void reducirDeuda(int monto){
        this.deuda-=monto;
    }
}
