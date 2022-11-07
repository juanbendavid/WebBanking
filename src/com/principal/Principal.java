
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
        //setImageLabel(depositoBtn, "src/com/images/aplicacion-wallet-pass.png");
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

        txtclave = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ingresarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contenedor = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tarjetaBtn = new javax.swing.JButton();
        depositoBtn = new javax.swing.JButton();
        saldoBtn = new javax.swing.JButton();
        transferenciasBtn = new javax.swing.JButton();
        serviciosBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtclave.setBackground(new java.awt.Color(255, 255, 255));
        txtclave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtclave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtclave.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 920, 110));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenido Rodrigo Salinas");
        txtclave.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 540, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gs. 2.300.000");
        jLabel5.setToolTipText("");
        txtclave.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 340, -1));

        contenedor.setToolTipText("");
        contenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtclave.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 340, 150));
        txtclave.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Su saldo actual es");
        txtclave.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 250, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Cuenta n° 46-7154546");
        txtclave.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 250, -1));

        tarjetaBtn.setBackground(new java.awt.Color(0, 102, 102));
        tarjetaBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        tarjetaBtn.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaBtn.setText(" Pago de Tarjeta de Crédito");
        tarjetaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tarjetaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarjetaBtnMouseClicked(evt);
            }
        });
        tarjetaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaBtnActionPerformed(evt);
            }
        });
        txtclave.add(tarjetaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 260, 40));

        depositoBtn.setBackground(new java.awt.Color(0, 102, 102));
        depositoBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        depositoBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositoBtn.setText("Depósito");
        depositoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositoBtnMouseClicked(evt);
            }
        });
        depositoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoBtnActionPerformed(evt);
            }
        });
        txtclave.add(depositoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 40));

        saldoBtn.setBackground(new java.awt.Color(0, 102, 102));
        saldoBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        saldoBtn.setForeground(new java.awt.Color(255, 255, 255));
        saldoBtn.setText("Saldo");
        saldoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saldoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoBtnActionPerformed(evt);
            }
        });
        txtclave.add(saldoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 150, 40));

        transferenciasBtn.setBackground(new java.awt.Color(0, 102, 102));
        transferenciasBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        transferenciasBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferenciasBtn.setText("Transferencias");
        transferenciasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferenciasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferenciasBtnMouseClicked(evt);
            }
        });
        txtclave.add(transferenciasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 180, 40));

        serviciosBtn.setBackground(new java.awt.Color(0, 102, 102));
        serviciosBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        serviciosBtn.setForeground(new java.awt.Color(255, 255, 255));
        serviciosBtn.setText("Pago de Servicios");
        serviciosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviciosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviciosBtnMouseClicked(evt);
            }
        });
        txtclave.add(serviciosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saldoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoBtnActionPerformed

    private void depositoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoBtnActionPerformed

    private void tarjetaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaBtnActionPerformed

    private void ingresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseClicked
        // TODO add your handling code here:
        
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ingresarBtnMouseClicked

    private void depositoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositoBtnMouseClicked
        // TODO add your handling code here:
        Deposito ventanaDeposito = new Deposito();
        ventanaDeposito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositoBtnMouseClicked

    private void serviciosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosBtnMouseClicked
        // TODO add your handling code here:
        PagoServicios ventanaPagoServicios = new PagoServicios();
        ventanaPagoServicios.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_serviciosBtnMouseClicked

    private void tarjetaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaBtnMouseClicked
        // TODO add your handling code here:
        PagoTarjeta  ventaPagoTarjeta = new PagoTarjeta();
        ventaPagoTarjeta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tarjetaBtnMouseClicked

    private void transferenciasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferenciasBtnMouseClicked
        // TODO add your handling code here:
        Transferencias ventaTransferencias = new Transferencias();
        ventaTransferencias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transferenciasBtnMouseClicked

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
    
    public void setImageLabel(JButton labelname, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contenedor;
    private javax.swing.JButton depositoBtn;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saldoBtn;
    private javax.swing.JSeparator separador;
    private javax.swing.JButton serviciosBtn;
    private javax.swing.JButton tarjetaBtn;
    private javax.swing.JButton transferenciasBtn;
    private javax.swing.JPanel txtclave;
    // End of variables declaration//GEN-END:variables
}
