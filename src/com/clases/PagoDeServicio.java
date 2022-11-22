package com.clases;


/**
 *
 * @author Rodrigo
 */
public class PagoDeServicio {
    private Cuenta cuenta;
    private String fecha;
    private String hora;
    private String pinTransferencia;
    private String codigoServicio;
    private int monto;

    public PagoDeServicio(Cuenta cuenta, String fecha, String hora, String pinTransferencia, String codigoServicio, int monto) {
        this.cuenta = cuenta;
        this.fecha = fecha;
        this.hora = hora;
        this.pinTransferencia = pinTransferencia;
        this.codigoServicio = codigoServicio;
        this.monto = monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPinTransferencia() {
        return pinTransferencia;
    }

    public void setPinTransferencia(String pinTransferencia) {
        this.pinTransferencia = pinTransferencia;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
