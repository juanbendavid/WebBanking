package com.clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */
public class PagoConTarjeta extends PagoDeServicio {
    private Tarjeta tarjeta;

    public PagoConTarjeta(Tarjeta tarjeta, Cuenta cuenta, String fecha, String hora, String pinTransferencia, String codigoServicio, int monto) {
        super(cuenta, fecha, hora, pinTransferencia, codigoServicio, monto);
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
