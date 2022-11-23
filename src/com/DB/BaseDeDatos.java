
package com.DB;

import com.clases.Cliente;
import com.clases.Cuenta;
import com.clases.Movimiento;
import com.clases.Servicio;
import com.clases.Tarjeta;
import java.sql.Connection;  
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  
import java.util.ArrayList;


public class BaseDeDatos {
    public Connection miconexion;
    // String de conexion de SQLite a la base de datos que se usa
    public String url;
    public String nombre;
    
    public BaseDeDatos(String url, String nombre) {
        this.url = url;
        this.nombre = nombre;
        conectar();
        inicializarTablasBD();
    }
    
    public void conectar() {
         
        Connection miconexion = null;
        // Intentar a connectar a la BD
        try {
            miconexion = DriverManager.getConnection(url); 
            if (miconexion != null) {  
                DatabaseMetaData meta = miconexion.getMetaData();  
                System.out.println("El nombre del controlador es " 
                        + meta.getDriverName()); 
            }
        } 
        // En caso de que no se pudo conectar a la BD, imprimir el error
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        this.miconexion = miconexion;
    }
    
    public void desconectar() {
        try {  
            if (this.miconexion != null) {  
                this.miconexion.close();  
            }  
        } 
        catch (SQLException ex) {  
            System.out.println(ex.getMessage());  
        }
    }
    
    public void inicializarTablasBD() {
        String sqlT1 = "CREATE TABLE IF NOT EXISTS Clientes (\n"
                + "idCliente TEXT NOT NULL PRIMARY KEY,\n"
                + "nombre TEXT NOT NULL,\n"
                + "pinCuenta TEXT NOT NULL\n);";
        
        String sqlT2 = "CREATE TABLE IF NOT EXISTS Tarjetas (\n"
                + "idTarjeta TEXT NOT NULL PRIMARY KEY,\n"
                + "idCliente TEXT NOT NULL,\n"
                + "deuda INTEGER NOT NULL,\n"
                + "saldo INTEGER NOT NULL,\n"
                + "CONSTRAINT \"Tarjetas_FK_idCliente\" FOREIGN KEY(idCliente) REFERENCES Clientes(idCliente)\n);";
        
        String sqlT3 = "CREATE TABLE IF NOT EXISTS Cuentas (\n"
                + "idCuenta TEXT NOT NULL PRIMARY KEY,\n"
                + "idCliente TEXT NOT NULL,\n"
                + "pinTrans TEXT NOT NULL,\n"
                + "saldo INTEGER NOT NULL,\n"
                + "CONSTRAINT \"Cuentas_FK_idCliente\" FOREIGN KEY(idCliente) REFERENCES Clientes(idCliente)\n);";
        
        String sqlT4 = "CREATE TABLE IF NOT EXISTS Movimientos (\n"
                + "idMovimiento INTEGER NOT NULL PRIMARY KEY,\n"
                + "idRemitente TEXT,\n"
                + "idDestinatario TEXT,\n"
                + "monto INTEGER NOT NULL,\n"
                + "Fecha TEXT NOT NULL,\n"
                + "Hora TEXT NOT NULL,\n"
                + "descripcion TEXT NOT NULL,\n"
                + "concepto TEXT NOT NULL,\n"
                + "CONSTRAINT \"Movimientos_FK_idRemitente\" FOREIGN KEY(idRemitente) REFERENCES Clientes(idCliente),\n"
                + "CONSTRAINT \"Movimientos_FK_idDestinatario\" FOREIGN KEY(idDestinatario) REFERENCES Clientes(idCliente)\n);";
        
        String sqlT5 = "CREATE TABLE IF NOT EXISTS Servicios (\n"
                + "idServicio INTEGER NOT NULL PRIMARY KEY,\n"
                + "servicio TEXT NOT NULL,\n"
                + "idCliente TEXT NOT NULL,\n"
                + "monto INTEGER NOT NULL,\n"
                + "CONSTRAINT \"Servicios_FK_idCliente\" FOREIGN KEY(idCliente) REFERENCES Clientes(idCliente)\n);";
        
        try{  
            Statement stmt = miconexion.createStatement();  
            stmt.execute(sqlT1);
            stmt.execute(sqlT2);
            stmt.execute(sqlT3);
            stmt.execute(sqlT4);
            stmt.execute(sqlT5);
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    
    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO Clientes VALUES(?,?,?)";
        try{  
            PreparedStatement pstmt = miconexion.prepareStatement(sql);  
            pstmt.setString(1, cliente.getIdCliente());  
            pstmt.setString(2, cliente.getNombre());
            pstmt.setString(3, cliente.getPinCuenta());  
            pstmt.executeUpdate();  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    public void agregarTarjeta(Tarjeta tarjeta, String idCliente) {
        String sql = "INSERT INTO Tarjetas VALUES(?,?,?,?)";
        try{  
            PreparedStatement pstmt = miconexion.prepareStatement(sql);  
            pstmt.setString(1, tarjeta.getIdTarjeta());  
            pstmt.setString(2, idCliente);
            pstmt.setInt(3, tarjeta.getDeuda());  
            pstmt.setInt(4, tarjeta.getSaldo());  
            pstmt.executeUpdate();  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    
    public void agregarCuenta(Cuenta cuenta, String idCliente) {
        String sql = "INSERT INTO Cuentas VALUES(?,?,?,?)";
        try{  
            PreparedStatement pstmt = miconexion.prepareStatement(sql);  
            pstmt.setString(1, cuenta.getIdCuenta());  
            pstmt.setString(2, idCliente);
            pstmt.setString(3, cuenta.getPinCuenta());  
            pstmt.setInt(4, cuenta.getSaldo());  
            pstmt.executeUpdate();  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    
    public void agregarMovimiento(Movimiento movimiento) {
        String sql = "INSERT INTO Movimientos(idRemitente, idDestinatario,monto,"
                + "Fecha,Hora,descripcion, concepto) VALUES(?,?,?,?,?,?,?)";
        try{  
            PreparedStatement pstmt = miconexion.prepareStatement(sql); 
            pstmt.setString(1, movimiento.getRemitente());
            pstmt.setString(2, movimiento.getDestinatario());  
            pstmt.setInt(3, movimiento.getMonto());  
            pstmt.setString(4, movimiento.getFecha());
            pstmt.setString(5, movimiento.getHora());
            pstmt.setString(6, movimiento.getDescripcion());
            pstmt.setString(7, movimiento.getTipo());
            pstmt.executeUpdate();  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
    }
    
    public void agregarServicio(Servicio servicio, String idCliente) {
        String sql = "INSERT INTO Servicios VALUES(?,?,?,?)";
        try{  
            PreparedStatement pstmt = miconexion.prepareStatement(sql);  
            pstmt.setInt(1, servicio.getIdServicio());  
            pstmt.setString(2, servicio.getNombreServicio());
            pstmt.setString(3, idCliente);  
            pstmt.setInt(4, servicio.getSaldo());
            pstmt.executeUpdate();  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } 
    }
    
    public Cuenta buscarCuentaBD(String idCuenta) {
        String sql = "SELECT * FROM Cuentas WHERE idCuenta = ?";
        
        try{
            PreparedStatement pstmt  = miconexion.prepareStatement(sql);
            // Establecer los valores a buscar
            pstmt.setString(1,idCuenta);
            
            // Hacer la busqueda 
            ResultSet resultado  = pstmt.executeQuery();
            
            if (resultado.next()) { // Si tiene por lo menos un elemento
                String pinTrans = resultado.getString(3);
                int monto = resultado.getInt(4);
                ArrayList<Movimiento> movimientos = buscarMovimientosBD(idCuenta);
                
                // Inicializar una clase cliente
                Cuenta cuenta = new Cuenta(monto, movimientos, idCuenta);
                cuenta.setPinCuenta(pinTrans);
                return cuenta;
            }
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // Tirar una excepcion en el caso de que nigun cliente fue encontrado 
        throw new IllegalArgumentException("El numero de cuenta destinatario no existe");
    }
    
    public ArrayList<Cuenta> buscarCuentasBD(String idCliente) {
        String sql = "SELECT * FROM Cuentas WHERE idCliente = ?";
        
        try{
            PreparedStatement pstmt  = miconexion.prepareStatement(sql);
            // Establecer los valores a buscar
            pstmt.setString(1,idCliente);
            
            // Hacer la busqueda 
            ResultSet resultado  = pstmt.executeQuery();
            
            // Crear un ArrayList de cuentas
            ArrayList<Cuenta> lista = new ArrayList<>();
            
            // Iterar por los resultados y crear e agregar las clases cuentas a la lista de cuentas  
            while (resultado.next()) {
                String idCuenta = resultado.getString(1);
                String pinTrans = resultado.getString(3);
                int monto = resultado.getInt(4);
                // Buscar los movimientos correspondientes al cliente
                ArrayList<Movimiento> movimientos = buscarMovimientosBD(idCuenta);
                Cuenta cuenta = new Cuenta(monto, idCuenta, pinTrans);
                cuenta.setMovimientos(movimientos);
                lista.add(cuenta);
            }
            return lista;
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<Movimiento> buscarMovimientosBD(String idCuenta) {
        String sql = "SELECT * FROM Movimientos WHERE idRemitente = ? OR idDestinatario = ?";
        
        try{
            PreparedStatement pstmt  = miconexion.prepareStatement(sql);
            // Establecer los valores a buscar
            pstmt.setString(1,idCuenta);
            pstmt.setString(2,idCuenta);
            
            // Hacer la busqueda 
            ResultSet resultado  = pstmt.executeQuery();
            
            // Crear un ArrayList de movimientos
            ArrayList<Movimiento> lista = new ArrayList<>();
            
            // Iterar por los resultados y crear e agregar las clases cuentas a la lista de movimientos  
            while (resultado.next()) {  
                int idMovimiento = resultado.getInt(1);
                String idRemitente = resultado.getString(2);
                String idDestinatario = resultado.getString(3);
                int monto = resultado.getInt(4);
                String Fecha = resultado.getString(5);
                String Hora = resultado.getString(6);
                String descripcion = resultado.getString(7);
                String tipo = resultado.getString(8);
                
                Movimiento movimiento = new Movimiento(tipo, monto, idMovimiento, idDestinatario, idRemitente, Hora, Fecha, descripcion);
                lista.add(movimiento);
                
            }
            return lista;
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<Tarjeta> buscarTarjetas(String idCliente) {
        String sql = "SELECT * FROM Tarjetas WHERE idCliente = ?";
        
        try{
            PreparedStatement pstmt  = miconexion.prepareStatement(sql);
            // Establecer los valores a buscar
            pstmt.setString(1,idCliente);
            
            // Hacer la busqueda 
            ResultSet resultado  = pstmt.executeQuery();
            
            // Crear un ArrayList de tarjetas
            ArrayList<Tarjeta> lista = new ArrayList<>();
            
            // Iterar por los resultados y crear e agregar las clases cuentas a la lista de tarjetas  
            while (resultado.next()) {  
                String idTarjeta = resultado.getString(1);
                int deuda = resultado.getInt(3);
                int saldo = resultado.getInt(4);
                
                Tarjeta tarjeta = new Tarjeta(idTarjeta, deuda, saldo);
                lista.add(tarjeta);
                
            }
            return lista;
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<Servicio> buscarServicios(String idCliente) {
        String sql = "SELECT * FROM Servicios WHERE idCliente = ?";
        
        try{
            PreparedStatement pstmt  = miconexion.prepareStatement(sql);
            // Establecer los valores a buscar
            pstmt.setString(1,idCliente);
            
            // Hacer la busqueda 
            ResultSet resultado  = pstmt.executeQuery();
            
            // Crear un ArrayList de servicios
            ArrayList<Servicio> lista = new ArrayList<>();
            
            // Iterar por los resultados y crear e agregar las clases cuentas a la lista de servicios  
            while (resultado.next()) {  
                int idServicio = resultado.getInt(1);
                String nombreServicio = resultado.getString(2);
                int monto = resultado.getInt(4);
                
                Servicio servicio = new Servicio(idServicio, nombreServicio, monto);
                lista.add(servicio);
                
            }
            return lista;
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    
    
    public Cliente buscarClienteBD(String idCliente, String pinCuenta) {
        String sql = "SELECT * FROM Clientes WHERE idCliente = ? AND pinCuenta = ?";
        
        try{
            PreparedStatement pstmt  = miconexion.prepareStatement(sql);
            // Establecer los valores a buscar
            pstmt.setString(1,idCliente);
            pstmt.setString(2,pinCuenta);
            
            ResultSet resultado  = pstmt.executeQuery();
            
            if (resultado.next()) { // Si tiene por lo menos un elemento
                String nombre = resultado.getString(2);
                // Buscar las cuentas correspondientes al cliente
                ArrayList<Cuenta> cuentas = buscarCuentasBD(idCliente);
                // Buscar las tarjetas correspondientes al cliente
                ArrayList<Tarjeta> tarjetas = buscarTarjetas(idCliente);
                // Buscar los servicios correspondientes al cliente
                ArrayList<Servicio> servicios = buscarServicios(idCliente);
                
                // Inicializar una clase cliente
                Cliente cliente = new Cliente(nombre, idCliente, pinCuenta, cuentas, tarjetas);
                cliente.setServicios(servicios);
                return cliente;
            }
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        // Tirar una excepcion en el caso de que nigun cliente fue encontrado 
          throw new IllegalArgumentException("No existe usuario con el id y "
                  + "pin dado");
    }
    
    public void actualizarCuenta(Cuenta cuenta) {
        String sql = "UPDATE Cuentas SET saldo = ? WHERE idCuenta = ?";

        try{
            PreparedStatement pstmt = miconexion.prepareStatement(sql);
            // Establecer los parametros
            pstmt.setInt(1, cuenta.getSaldo());
            pstmt.setString(2, cuenta.getIdCuenta());
            
            // Actualizar
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarTarjeta(Tarjeta tarjeta) {
        String sql = "UPDATE Tarjetas SET deuda = ?, saldo = ? WHERE idTarjeta = ?";

        try{
            PreparedStatement pstmt = miconexion.prepareStatement(sql);
            // Establecer los parametros
            pstmt.setInt(1, tarjeta.getDeuda());
            pstmt.setInt(2, tarjeta.getSaldo());
            pstmt.setString(3, tarjeta.getIdTarjeta());
            
            // Actualizar
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarServicios(Servicio servicio) {
        String sql = "UPDATE Servicios SET monto = ? WHERE idServicio = ?";

        try{
            PreparedStatement pstmt = miconexion.prepareStatement(sql);
            // Establecer los parametros
            pstmt.setInt(1, servicio.getSaldo());
            pstmt.setInt(2, servicio.getIdServicio());
            
            // Actualizar
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        BaseDeDatos B1 = new BaseDeDatos("jdbc:sqlite:database.db", "database.db");
        Cliente tom = new Cliente("Juan", "5611898", "12345", null, null);
        Tarjeta t1 = new Tarjeta("154184", 2000, 1000);
        Movimiento m1 = new Movimiento("pago de Servicio", 1000, 54, "3454236", null, "19:35:22", "2022-11-22", "tigo");
        Cuenta c11 = new Cuenta(10000, "55555", "54321");
        Servicio s1 = new Servicio(15646, "tigo", 1000);
       
        
        
        
        //B1.agregarCliente(tom);
        //B1.agregarTarjeta(t1, tom.getIdCliente());
        //B1.agregarMovimiento(m1);
        B1.agregarCuenta(c11, "5611898");
        //B1.agregarServicio(s1, "5611898");
        c11.setSaldo(50000);
        //B1.actualizarCuenta(c11);
        t1.setDeuda(30000);
        t1.setSaldo(10);
        B1.actualizarTarjeta(t1);
        s1.setSaldo(1);
        B1.actualizarServicios(s1);
    }
  
    
    
}
