
package com.Transferencias;

import com.deposito.*;
import com.login.*;
import com.principal.Principal;

/**
 *
 * @author Juan David
 */
public class Transferencias extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Transferencias() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        depositarBtn = new javax.swing.JButton();
        txtNomYApe = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtclave.setBackground(new java.awt.Color(255, 255, 255));
        txtclave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtclave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Transferencia entre Cuentas");
        txtclave.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 500, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Web Banking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(313, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(268, 268, 268)))
        );

        txtclave.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 330, 610));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nombre y Apellido ");
        txtclave.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 20));

        txtCuenta.setBackground(new java.awt.Color(255, 255, 255));
        txtCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCuenta.setText("14-21541245");
        txtCuenta.setToolTipText("asdasd");
        txtCuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });
        txtclave.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 380, 20));
        txtclave.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 370, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Seleccione una cuenta");
        txtclave.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 250, 20));
        txtclave.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 370, 20));

        depositarBtn.setBackground(new java.awt.Color(0, 102, 102));
        depositarBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        depositarBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositarBtn.setText("Transferir");
        depositarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositarBtnMouseClicked(evt);
            }
        });
        depositarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarBtnActionPerformed(evt);
            }
        });
        txtclave.add(depositarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 150, 40));

        txtNomYApe.setBackground(new java.awt.Color(255, 255, 255));
        txtNomYApe.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNomYApe.setText("Marcelo Pauls");
        txtNomYApe.setToolTipText("asdasd");
        txtNomYApe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNomYApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomYApeActionPerformed(evt);
            }
        });
        txtclave.add(txtNomYApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 380, 20));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "n° 12345 Saldo: 300.000", "n° 54-248742 Saldo: 1.000.000", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        txtclave.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 370, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Número de Cuenta");
        txtclave.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 250, 20));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Número de Cédula");
        txtclave.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, 20));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCedula.setText("6124575");
        txtCedula.setToolTipText("asdasd");
        txtCedula.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtclave.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 380, 20));
        txtclave.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 370, 20));

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

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaActionPerformed

    private void txtNomYApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomYApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomYApeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void depositarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositarBtnActionPerformed

    private void depositarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositarBtnMouseClicked
        // TODO add your handling code here:
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositarBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositarBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtNomYApe;
    private javax.swing.JPanel txtclave;
    // End of variables declaration//GEN-END:variables
}
