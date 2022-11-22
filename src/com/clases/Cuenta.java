package com.clases;


import java.util.ArrayList;



/**
 *
 * @author Rodrigo
 */
public class Cuenta {
    private int saldo;
    private ArrayList<Movimiento> movimientos;
    private String idCuenta;
    private String pinCuenta;

    public Cuenta(String idCuenta) {
        this.idCuenta = idCuenta;
        this.movimientos = new ArrayList<>();
    }

    
    public Cuenta(int saldo, String idCuenta, String pinCuenta) {
        this.saldo = saldo;
        this.idCuenta = idCuenta;
        this.movimientos = new ArrayList<>();
        this.pinCuenta = pinCuenta;
    }
    
    public Cuenta(int saldo, ArrayList<Movimiento> movimientos, String idCuenta) {
        this.saldo = saldo;
        this.movimientos = movimientos;
        this.idCuenta = idCuenta;
    }

    public String getPinCuenta() {
        return pinCuenta;
    }

    public void setPinCuenta(String pinCuenta) {
        this.pinCuenta = pinCuenta;
    }
    
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void aumentarSaldo (int monto){
        this.saldo+=monto;
    }
    
    public void reducirSaldo (int monto){
        this.saldo-=monto;
    }
    
    public void addMovimiento (Movimiento movimiento){
        this.movimientos.add(movimiento);
    }
    
    public void comitBD(){
        return;
    }
}
