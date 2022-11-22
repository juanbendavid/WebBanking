
package com.clases;

/**
 *
 * @author Juan David
 */
public class Servicio {
    
    private int  idServicio;
    private String nombreServicio;
    private int Saldo;

    public Servicio(int idServicio, String nombreServicio, int Saldo) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.Saldo = Saldo;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    public void reducirSaldo(int monto) {
        this.Saldo-=monto;
    }
    
    
}
