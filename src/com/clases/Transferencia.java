package com.clases;



/**
 *
 * @author Rodrigo
 */
public class Transferencia {
    private Cuenta destinatario;
    private String idDestinatario;
    private Cuenta origen;
    private String idOrigen;
    private String fecha;
    private String hora;
    private String pinTransferencia;
    private int monto;

    public Transferencia(Cuenta destinatario, String idDestinatario, Cuenta origen, String idOrigen, String fecha, String hora, String pinTransferencia, int monto) {
        this.destinatario = destinatario;
        this.idDestinatario = idDestinatario;
        this.origen = origen;
        this.idOrigen = idOrigen;
        this.fecha = fecha;
        this.hora = hora;
        this.pinTransferencia = pinTransferencia;
        this.monto = monto;
    }

    public Cuenta getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cuenta destinatario) {
        this.destinatario = destinatario;
    }

    public String getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(String idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public Cuenta getOrigen() {
        return origen;
    }

    public void setOrigen(Cuenta origen) {
        this.origen = origen;
    }

    public String getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(String idOrigen) {
        this.idOrigen = idOrigen;
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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
