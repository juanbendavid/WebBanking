
package com.pagoTarjeta;

import com.clases.Cliente;
import com.clases.Cuenta;
import com.clases.FuncionesExtras;
import com.clases.Movimiento;
import com.pagoServicios.*;
import com.deposito.*;
import com.login.*;
import com.principal.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import com.clases.ValidarPinDeTransacción;

/**
 *
 * @author Juan David
 */
public class PagoTarjeta extends javax.swing.JFrame implements ValidarPinDeTransacción {

    /**
     * Creates new form login
     */
     private Cliente cliente;

    public PagoTarjeta() {
        
    }
    public PagoTarjeta(Cliente cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        FuncionesExtras.cargarTarjetas(cliente, jComboBox1);
        FuncionesExtras.cargarCuentas(cliente, jComboBox2);
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
        txtmonto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        pagarTarjetaBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtdeuda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtclave.setBackground(new java.awt.Color(255, 255, 255));
        txtclave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtclave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pago de Tarjeta de Crédito");
        txtclave.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 490, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Web Banking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(323, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(268, 268, 268)))
        );

        txtclave.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 340, 620));

        txtmonto.setBackground(new java.awt.Color(255, 255, 255));
        txtmonto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtmonto.setText("50000");
        txtmonto.setToolTipText("asdasd");
        txtmonto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });
        txtclave.add(txtmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 380, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Seleccionar Tarjeta");
        txtclave.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 20));
        txtclave.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 370, 20));

        pagarTarjetaBtn.setBackground(new java.awt.Color(0, 102, 102));
        pagarTarjetaBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        pagarTarjetaBtn.setForeground(new java.awt.Color(255, 255, 255));
        pagarTarjetaBtn.setText("Pagar");
        pagarTarjetaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagarTarjetaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarTarjetaBtnMouseClicked(evt);
            }
        });
        pagarTarjetaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarTarjetaBtnActionPerformed(evt);
            }
        });
        txtclave.add(pagarTarjetaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 150, 40));

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
        txtclave.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, 30));

        txtdeuda.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        txtdeuda.setForeground(new java.awt.Color(0, 0, 0));
        txtdeuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtdeuda.setText("Deuda Total: Gs. 500.000");
        txtclave.add(txtdeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 250, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Monto a pagar");
        txtclave.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Seleccione una cuenta");
        txtclave.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 250, 20));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        txtclave.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 370, 30));

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    
    
    
    private void pagarTarjetaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarTarjetaBtnActionPerformed
        // TODO add your handling code here:
        
        JOptionPane ventanaPin = new JOptionPane();
        int indiceTarjeta = jComboBox1.getSelectedIndex();
        int indiceCuenta = jComboBox2.getSelectedIndex();
        Cuenta cuentaCliente = cliente.getCuentas().get(indiceCuenta);
        String inPin = ventanaPin.showInputDialog("Ingrese su pin");
       
        if(!validación(inPin, cuentaCliente.getPinCuenta())){
            JOptionPane.showMessageDialog(null,
                    "Pin inválido", "Error de Transacción", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int deuda = cliente.getTarjetas().get(indiceTarjeta).getDeuda();
        int monto = Integer.parseInt(txtmonto.getText());
        // obtener hora
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        
        
        if(monto>0 & cuentaCliente.getSaldo()-monto>=0 & deuda-monto>=0){
            cliente.getCuentas().get(indiceCuenta).reducirSaldo(monto);     // se reduce el saldo de la cuenta 
            cliente.getTarjetas().get(indiceTarjeta).reducirDeuda(monto);   // se reduce la deuda de la tarjeta
            // creacion de movimiento realizado
            Movimiento movimiento = new Movimiento("Pago de Tarjeta de Crédito", monto,
                    cliente.getTarjetas().get(indiceTarjeta).getIdTarjeta(),
                    cuentaCliente.getIdCuenta(), hora.toString(), fecha.toString());
            
            cliente.getCuentas().get(indiceCuenta).addMovimiento(movimiento);   // agrega el movimiento a la cuenta del cliente
        }
        
        Principal ventanaPrincipal = new Principal(cliente, indiceCuenta);
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pagarTarjetaBtnActionPerformed

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoActionPerformed

    private void pagarTarjetaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTarjetaBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pagarTarjetaBtnMouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        int indice = jComboBox1.getSelectedIndex();
        txtdeuda.setText("Deuda Total: " + cliente.getTarjetas().get(indice).getDeuda());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(PagoTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PagoTarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pagarTarjetaBtn;
    private javax.swing.JSeparator separador1;
    private javax.swing.JPanel txtclave;
    private javax.swing.JLabel txtdeuda;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean validación(String pin1, String pin2) {
        return pin1.equals(pin2);
    }
}
