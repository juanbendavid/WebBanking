
package com.clases;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Juan David
 */
public class FuncionesExtras {
    
    public static void cargarCuentas(Cliente cliente, JComboBox jComboBox) {
        ArrayList<Cuenta> arrayList = cliente.getCuentas();
        for (Cuenta cuenta : arrayList) {
            jComboBox.addItem("N° " + cuenta.getIdCuenta() + " Saldo: " + cuenta.getSaldo());
        }
    }
     
    public static void cargarTarjetas(Cliente cliente, JComboBox jComboBox) {
        ArrayList<Tarjeta> arrayList = cliente.getTarjetas();
        for (Tarjeta tarjeta : arrayList) {
            jComboBox.addItem("N° " + tarjeta.getIdTarjeta());
        }
    }
    
    public static void cargarServicios(Cliente cliente, JComboBox jComboBox) {
        ArrayList<Servicio> arrayList = cliente.getServicios();
        for (Servicio servicio : arrayList) {
            jComboBox.addItem(servicio.getNombreServicio());
        }
    }
    
    public static void cargarCuentasPrincipal(Cliente cliente, JComboBox jComboBox) {
        ArrayList<Cuenta> arrayList = cliente.getCuentas();
        int i = 0;
        for (Cuenta cuenta : arrayList) {
            jComboBox.addItem(++i);
        }
    }
    
    public static void Distinto(String cuenta1, String cuenta2) throws Exception{
        if (cuenta1.equals(cuenta2)){
            throw new Exception("Cuenta remitente y origen iguales");
        }
    }
}
