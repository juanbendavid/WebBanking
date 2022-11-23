package com.pagoServicios;

import com.DB.BaseDeDatos;
import com.clases.Cliente;
import com.clases.Cuenta;
import com.deposito.*;
import com.login.*;
import com.principal.Principal;
import com.clases.*;
import com.clases.Movimiento;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David
 */
public class PagoServicios extends javax.swing.JFrame implements ValidarPinDeTransacción {

    /**
     * Creates new form login
     */
    private Cliente cliente;
    private BaseDeDatos db;
    public PagoServicios() {

    }

    public PagoServicios(Cliente cliente, BaseDeDatos db ) {
        initComponents();
        this.setLocationRelativeTo(null);
        cambiarImagen(imageLogo, "bancoG.png");
        this.db = db;
        this.cliente = cliente;
        FuncionesExtras.cargarCuentas(cliente, jComboBox2);
        FuncionesExtras.cargarServicios(cliente, jComboBox1);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imageLogo = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtDeuda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pagarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtclave.setBackground(new java.awt.Color(255, 255, 255));
        txtclave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtclave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pago de Servicios");
        txtclave.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.control);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Viruróga");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tu dinero importa");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(imageLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(imageLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(206, 206, 206))
        );

        txtclave.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 350, 610));

        txtmonto.setBackground(new java.awt.Color(255, 255, 255));
        txtmonto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtmonto.setText("100000");
        txtmonto.setToolTipText("asdasd");
        txtmonto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });
        txtclave.add(txtmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 380, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Seleccione un servicio");
        txtclave.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 20));
        txtclave.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 370, 20));

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

        txtDeuda.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        txtDeuda.setForeground(new java.awt.Color(0, 0, 0));
        txtDeuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDeuda.setText("Deuda Total: Gs. 500.000");
        txtclave.add(txtDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Monto a pagar");
        txtclave.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 250, 20));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        txtclave.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 370, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Seleccione una cuenta");
        txtclave.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 250, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pagarBtn.setBackground(new java.awt.Color(0, 102, 102));
        pagarBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        pagarBtn.setForeground(new java.awt.Color(255, 255, 255));
        pagarBtn.setText("Pagar");
        pagarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarBtnMouseClicked(evt);
            }
        });
        pagarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelarBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        cancelarBtn.setForeground(new java.awt.Color(0, 102, 102));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBtnMouseClicked(evt);
            }
        });
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtclave.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 370, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtclave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void pagarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarBtnActionPerformed

    private void pagarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarBtnMouseClicked
        // TODO add your handling code here:

        int indiceServicio = jComboBox1.getSelectedIndex();
        int indiceCuenta = jComboBox2.getSelectedIndex();
        Cuenta cuentaCliente = cliente.getCuentas().get(indiceCuenta);
        JOptionPane ventanaPin = new JOptionPane();

        try {
            String inPin = ventanaPin.showInputDialog("Ingrese su pin");
            if (!validación(inPin, cuentaCliente.getPinCuenta())) {
                JOptionPane.showMessageDialog(null,
                        "Pin inválido", "Error de Transacción", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (Exception e) {
            return;
        }

        int deuda = cliente.getServicios().get(indiceServicio).getSaldo();
        int monto = Integer.parseInt(txtmonto.getText());
        // obtener hora
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();

        if (monto > 0 & cuentaCliente.getSaldo() - monto >= 0 & deuda - monto >= 0) {
            cliente.getCuentas().get(indiceCuenta).reducirSaldo(monto);     // se reduce el saldo de la cuenta 
            cliente.getServicios().get(indiceServicio).reducirSaldo(monto);   // se reduce la deuda del Servicio
            // creacion de movimiento realizado
            Movimiento movimiento = new Movimiento("Pago de Servicio", monto,
                    cuentaCliente.getIdCuenta(), hora.toString(), fecha.toString(),
                    jComboBox1.getSelectedItem().toString());

            cliente.getCuentas().get(indiceCuenta).addMovimiento(movimiento);   // agrega el movimiento a la cuenta del cliente
            Principal ventanaPrincipal = new Principal(cliente, indiceCuenta, db);
            ventanaPrincipal.setVisible(true);
            this.dispose();
        } else {
             JOptionPane.showMessageDialog(null,
                    "Monto inválido", "Error de Transacción", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_pagarBtnMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        int indice = jComboBox1.getSelectedIndex();
        txtDeuda.setText("Deuda Total: " + cliente.getServicios().get(indice).getSaldo());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked
        // TODO add your handling code here:
        Principal ventanaPrincipal = new Principal(cliente, 0, db);
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void imageLogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLogoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_imageLogoMouseMoved

    private void imageLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imageLogoMouseClicked
    
     private void cambiarImagen(JLabel label, String cadena) {
        setImageLabel(label, "src/com/images/" + cadena);
    }

    public void setImageLabel(JLabel labelname, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
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
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pagarBtn;
    private javax.swing.JSeparator separador1;
    private javax.swing.JLabel txtDeuda;
    private javax.swing.JPanel txtclave;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean validación(String pin1, String pin2) {
        return pin1.equals(pin2);
    }
}
