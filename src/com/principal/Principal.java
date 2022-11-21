
package com.principal;

import com.Transferencias.Transferencias;
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
    public Principal() {
        initComponents();
        // para colocar iconos
        setImageLabel(imageDeposito, "src/com/images/wallet.png");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        txtPago = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ingresarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contenedor = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imageDeposito = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imageSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JLabel();
        imageTransaccion = new javax.swing.JLabel();
        txtTransacciones = new javax.swing.JLabel();
        imageTarjeta = new javax.swing.JLabel();
        txtTransacciones1 = new javax.swing.JLabel();
        imageServicios = new javax.swing.JLabel();
        txtTransacciones2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        txtPago.setBackground(new java.awt.Color(255, 255, 255));
        txtPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Web Banking");

        ingresarBtn.setBackground(new java.awt.Color(0, 153, 153));
        ingresarBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        ingresarBtn.setForeground(new java.awt.Color(0, 0, 0));
        ingresarBtn.setText("Cerrar Sesión");
        ingresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(268, 268, 268)))
        );

        txtPago.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 920, 110));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenido Rodrigo Salinas");
        txtPago.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 540, -1));

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
        txtPago.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 150, -1));

        contenedor.setToolTipText("");
        contenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPago.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 340, 150));
        txtPago.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Su saldo actual es");
        txtPago.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 250, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Cuenta n° 46-7154546");
        txtPago.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 250, -1));

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
        txtPago.add(imageDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 70, 70));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gs. 2.300.000");
        jLabel6.setToolTipText("");
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        txtPago.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 340, -1));

        imageSaldo.setText("imageDeposito");
        imageSaldo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageSaldoMouseMoved(evt);
            }
        });
        imageSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageSaldoMouseClicked(evt);
            }
        });
        txtPago.add(imageSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 70, 70));

        txtSaldo.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(0, 0, 0));
        txtSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldo.setText("Saldo");
        txtSaldo.setToolTipText("");
        txtSaldo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtSaldoMouseMoved(evt);
            }
        });
        txtPago.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 150, -1));

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
        txtPago.add(imageTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 70, 70));

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
        txtPago.add(txtTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 150, -1));

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
        txtPago.add(imageTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 70, 70));

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
        txtPago.add(txtTransacciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 150, -1));

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
        txtPago.add(imageServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 70, 70));

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
        txtPago.add(txtTransacciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarImagen(JLabel label, String cadena){
         setImageLabel(label, "src/com/images/"+cadena);
    }
    
    private void ingresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseClicked
        // TODO add your handling code here:
        
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ingresarBtnMouseClicked

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel5MouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         cambiarImagen(imageDeposito, "wallet.png");
         cambiarImagen(imageSaldo, "saldo.png");
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
        Deposito  deposito = new Deposito();
        deposito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imageDepositoMouseClicked

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseMoved

    private void imageSaldoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageSaldoMouseMoved
        // TODO add your handling code here:
        cambiarImagen(imageSaldo, "saldo_move.png");
    }//GEN-LAST:event_imageSaldoMouseMoved

    private void imageSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageSaldoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageSaldoMouseClicked

    private void txtSaldoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSaldoMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSaldoMouseMoved

    private void imageTransaccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageTransaccionMouseMoved
        // TODO add your handling code here:
        cambiarImagen(imageTransaccion, "transaction_move.png");
    }//GEN-LAST:event_imageTransaccionMouseMoved

    private void imageTransaccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageTransaccionMouseClicked
        // TODO add your handling code here:
        Transferencias  transferencia = new Transferencias();
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
        PagoTarjeta  pagoTarjeta = new PagoTarjeta();
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
        PagoServicios  pagoServicios = new PagoServicios();
        pagoServicios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imageServiciosMouseClicked

    private void txtTransacciones2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransacciones2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransacciones2MouseMoved

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
    private javax.swing.JLabel imageSaldo;
    private javax.swing.JLabel imageServicios;
    private javax.swing.JLabel imageTarjeta;
    private javax.swing.JLabel imageTransaccion;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator separador;
    private javax.swing.JPanel txtPago;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtTransacciones;
    private javax.swing.JLabel txtTransacciones1;
    private javax.swing.JLabel txtTransacciones2;
    // End of variables declaration//GEN-END:variables
}
