package com.clases;


/**
 *
 * @author Rodrigo
 */
public class Movimiento {
    private String tipo;
    private String descripcion;
    private int monto;
    private String idMovimiento;
    private String destinatario;
    private String origen;
    private String hora;
    private String fecha;

    
    public Movimiento(String tipo, int monto, String destinatario, String origen, String hora, String fecha, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.destinatario = destinatario;
        this.origen = origen;
        this.hora = hora;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    public Movimiento(String tipo, int monto, String origen, String hora, String fecha, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.origen = origen;
        this.hora = hora;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    public Movimiento(String tipo, int monto, String idMovimiento, String destinatario, String remitente, String hora, String fecha, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.idMovimiento = idMovimiento;
        this.destinatario = destinatario;
        this.origen = remitente;
        this.hora = hora;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
