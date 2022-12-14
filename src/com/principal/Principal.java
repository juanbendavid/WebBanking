
package com.principal;

import com.DB.BaseDeDatos;
import com.Transferencias.Transferencias;
import com.clases.Cliente;
import com.clases.FuncionesExtras;
import com.Saldo.Saldo;
import com.deposito.Deposito;
import com.login.*;
import com.pagoServicios.PagoServicios;
import com.pagoTarjeta.PagoTarjeta;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Juan David
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    private Cliente cliente;
    private BaseDeDatos db;
    public Principal(){
        
    }
    
    public Principal(Cliente cliente, int indice,  BaseDeDatos db) {
        initComponents();
        this.cliente= cargarClienteBD(cliente);
        this.db = db;
        cambiarImagen(imageLogo, "bancoG.png");
        FuncionesExtras.cargarCuentasPrincipal(cliente, jComboBox1);
        mostrarDatos(indice);
        this.setLocationRelativeTo(null);
        txtBienvenido.setText("Bienvenido " + this.cliente.getNombre()); // Título de bienvenida
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ingresarBtn = new javax.swing.JButton();
        imageLogo = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contenedor = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtNroCuenta = new javax.swing.JLabel();
        imageDeposito = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JLabel();
        imageTransaccion = new javax.swing.JLabel();
        txtTransacciones = new javax.swing.JLabel();
        imageTarjeta = new javax.swing.JLabel();
        txtTransacciones1 = new javax.swing.JLabel();
        imageServicios = new javax.swing.JLabel();
        txtTransacciones2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        ingresarBtn.setBackground(new java.awt.Color(255, 255, 255));
        ingresarBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        ingresarBtn.setForeground(new java.awt.Color(0, 0, 0));
        ingresarBtn.setText("Cerrar Sesión");
        ingresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarBtnMouseClicked(evt);
            }
        });
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        imageLogo.setText("imageDeposito");
        imageLogo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageLogoMouseMoved(evt);
            }
        });
        imageLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(imageLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarBtn)
                .addContainerGap(384, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 920, 120));

        txtBienvenido.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        txtBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        txtBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBienvenido.setText("Bienvenido Rodrigo Salinas");
        panelPrincipal.add(txtBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 540, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Depósito");
        jLabel5.setToolTipText("");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 150, -1));

        contenedor.setToolTipText("");
        contenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 340, 150));
        panelPrincipal.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Su saldo actual es");
        panelPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 250, -1));

        txtNroCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        txtNroCuenta.setForeground(new java.awt.Color(102, 102, 102));
        txtNroCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNroCuenta.setText("Cuenta n° 46-7154546");
        panelPrincipal.add(txtNroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 250, -1));

        imageDeposito.setText("imageDeposito");
        imageDeposito.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageDepositoMouseMoved(evt);
            }
        });
        imageDeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageDepositoMouseClicked(evt);
            }
        });
        panelPrincipal.add(imageDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, 70));

        txtSaldoActual.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        txtSaldoActual.setForeground(new java.awt.Color(0, 0, 0));
        txtSaldoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoActual.setText("Gs. 2.300.000");
        txtSaldoActual.setToolTipText("");
        txtSaldoActual.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtSaldoActualMouseMoved(evt);
            }
        });
        panelPrincipal.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 340, -1));

        imageTransaccion.setText("imageDeposito");
        imageTransaccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageTransaccionMouseMoved(evt);
            }
        });
        imageTransaccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageTransaccionMouseClicked(evt);
            }
        });
        panelPrincipal.add(imageTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 70, 70));

        txtTransacciones.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtTransacciones.setForeground(new java.awt.Color(0, 0, 0));
        txtTransacciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTransacciones.setText("Transacciones");
        txtTransacciones.setToolTipText("");
        txtTransacciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtTransaccionesMouseMoved(evt);
            }
        });
        panelPrincipal.add(txtTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 150, -1));

        imageTarjeta.setText("imageDeposito");
        imageTarjeta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageTarjetaMouseMoved(evt);
            }
        });
        imageTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageTarjetaMouseClicked(evt);
            }
        });
        panelPrincipal.add(imageTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 70, 70));

        txtTransacciones1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtTransacciones1.setForeground(new java.awt.Color(0, 0, 0));
        txtTransacciones1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTransacciones1.setText("Tarjeta");
        txtTransacciones1.setToolTipText("");
        txtTransacciones1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtTransacciones1MouseMoved(evt);
            }
        });
        panelPrincipal.add(txtTransacciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 150, -1));

        imageServicios.setText("imageDeposito");
        imageServicios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageServiciosMouseMoved(evt);
            }
        });
        imageServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageServiciosMouseClicked(evt);
            }
        });
        panelPrincipal.add(imageServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 70, 70));

        txtTransacciones2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtTransacciones2.setForeground(new java.awt.Color(0, 0, 0));
        txtTransacciones2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTransacciones2.setText("Servicios");
        txtTransacciones2.setToolTipText("");
        txtTransacciones2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtTransacciones2MouseMoved(evt);
            }
        });
        panelPrincipal.add(txtTransacciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 220, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Cliente  cargarClienteBD(Cliente cliente){
        return cliente;
    }
    
    private void cambiarImagen(JLabel label, String cadena){
         setImageLabel(label, "src/com/images/"+cadena);
    }
    
    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel5MouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         cambiarImagen(imageDeposito, "wallet.png");
         cambiarImagen(imageTransaccion, "transaction.png");
         cambiarImagen(imageServicios, "servicios.png");
         cambiarImagen(imageTarjeta, "tarjeta.png");
    }//GEN-LAST:event_formMouseMoved

    private void imageDepositoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDepositoMouseMoved
        // TODO add your handling code here:
        setImageLabel(imageDeposito, "src/com/images/wallet_move.png");
    }//GEN-LAST:event_imageDepositoMouseMoved

    private void imageDepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDepositoMouseClicked
        // TODO add your handling code here:
        Deposito deposito = new Deposito(cliente, db);
        deposito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imageDepositoMouseClicked

    private void txtSaldoActualMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSaldoActualMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActualMouseMoved

    private void imageTransaccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageTransaccionMouseMoved
        // TODO add your handling code here:
        cambiarImagen(imageTransaccion, "transaction_move.png");
    }//GEN-LAST:event_imageTransaccionMouseMoved

    private void imageTransaccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageTransaccionMouseClicked
        // TODO add your handling code here:
        Transferencias  transferencia = new Transferencias(cliente, db);
        transferencia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imageTransaccionMouseClicked

    private void txtTransaccionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransaccionesMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTransaccionesMouseMoved

    private void imageTarjetaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageTarjetaMouseMoved
        // TODO add your handling code here:
        cambiarImagen(imageTarjeta, "tarjeta_move.png");
    }//GEN-LAST:event_imageTarjetaMouseMoved

    private void imageTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageTarjetaMouseClicked
        // TODO add your handling code here:
        PagoTarjeta  pagoTarjeta = new PagoTarjeta(cliente, db);
        pagoTarjeta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imageTarjetaMouseClicked

    private void txtTransacciones1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransacciones1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransacciones1MouseMoved

    private void imageServiciosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageServiciosMouseMoved
        // TODO add your handling code here:
        cambiarImagen(imageServicios, "servicios_move.png");
    }//GEN-LAST:event_imageServiciosMouseMoved

    private void imageServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageServiciosMouseClicked
        // TODO add your handling code here:
        PagoServicios  pagoServicios = new PagoServicios(cliente, db);
        pagoServicios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imageServiciosMouseClicked

    private void txtTransacciones2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransacciones2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransacciones2MouseMoved

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        int indice = jComboBox1.getSelectedIndex();
        txtNroCuenta.setText("Cuenta N° " + cliente.getCuentas().get(indice).getIdCuenta());
        txtSaldoActual.setText(cliente.getCuentas().get(indice).getSaldo() +"");
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void imageLogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLogoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_imageLogoMouseMoved

    private void imageLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imageLogoMouseClicked

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarBtnActionPerformed

    private void ingresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseClicked
        // TODO add your handling code here:

        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        this.dispose();
        db.desconectar();
    }//GEN-LAST:event_ingresarBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new Principal().setVisible(true);
            }
        });
    }
    
     private void mostrarDatos(int indice) {
        
        txtNroCuenta.setText("Cuenta N° " + cliente.getCuentas().get(indice).getIdCuenta());
        txtSaldoActual.setText(cliente.getCuentas().get(indice).getSaldo() +"");
    }
    public void setImageLabel(JLabel labelname, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contenedor;
    private javax.swing.JLabel imageDeposito;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel imageServicios;
    private javax.swing.JLabel imageTarjeta;
    private javax.swing.JLabel imageTransaccion;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel txtBienvenido;
    private javax.swing.JLabel txtNroCuenta;
    private javax.swing.JLabel txtSaldoActual;
    private javax.swing.JLabel txtTransacciones;
    private javax.swing.JLabel txtTransacciones1;
    private javax.swing.JLabel txtTransacciones2;
    // End of variables declaration//GEN-END:variables

   
}
