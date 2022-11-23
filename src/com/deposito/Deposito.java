
package com.deposito;
import com.clases.FuncionesExtras;
import com.clases.Cliente;
import com.clases.Cuenta;
import com.clases.Movimiento;
import com.login.*;
import com.clases.*;
import com.principal.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David
 */
public class Deposito extends javax.swing.JFrame implements ValidarPinDeTransacción {

    /**
     * Creates new form login
     */
    private Cliente cliente;

    public Deposito() {
        
    }

    public Deposito(Cliente cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        FuncionesExtras.cargarCuentas(cliente, jComboBox1);
        
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
        depositarBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        txtDescr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtclave.setBackground(new java.awt.Color(255, 255, 255));
        txtclave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtclave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Depósito");
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

        txtmonto.setBackground(new java.awt.Color(255, 255, 255));
        txtmonto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtmonto.setText("500000");
        txtmonto.setToolTipText("asdasd");
        txtmonto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });
        txtclave.add(txtmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 380, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Seleccione una cuenta");
        txtclave.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 250, 20));
        txtclave.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 370, 20));

        depositarBtn.setBackground(new java.awt.Color(0, 102, 102));
        depositarBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        depositarBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositarBtn.setText("Depositar");
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

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        txtclave.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 370, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Monto a Depositar");
        txtclave.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 250, 20));
        txtclave.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 370, 20));

        txtDescr.setBackground(new java.awt.Color(255, 255, 255));
        txtDescr.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDescr.setText("ahorro");
        txtDescr.setToolTipText("asdasd");
        txtDescr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDescr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescrActionPerformed(evt);
            }
        });
        txtclave.add(txtDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 380, 20));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Descripción");
        txtclave.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 290, 20));

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

    private void depositarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositarBtnActionPerformed

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoActionPerformed

    private void depositarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositarBtnMouseClicked
        // TODO add your handling code here:

        int indice = jComboBox1.getSelectedIndex();
        Cuenta cuenta = cliente.getCuentas().get(indice); // cuenta selececionada
        Integer monto = Integer.parseInt(txtmonto.getText()); // monto indicado
       
        JOptionPane ventanaPin = new JOptionPane();
        String inPin = ventanaPin.showInputDialog("Ingrese su pin");
        // validacion de pin

        try {
            if(!validación(inPin, cuenta.getPinCuenta())){
            JOptionPane.showMessageDialog(null,
                    "Pin inválido", "Error de Deposito", JOptionPane.WARNING_MESSAGE);
            return;
        }
        } catch (Exception e) {
            return;
        }
        
        cliente.getCuentas().get(indice).aumentarSaldo(monto);        //aumenta saldo en el objeto instanciado
        // obtener hora
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        
        // crea un nuevo movimiento
        
        Movimiento movimiento = new Movimiento("Deposito", monto, cuenta.getIdCuenta(),
                 hora.toString(), fecha.toString(), txtDescr.getText());
        
        cliente.getCuentas().get(indice).addMovimiento(movimiento);// añade el movimeinto a la cuenta del cliente
        
        //pasar cliente modificado a funcion para commit en BD
        
        Principal ventanaPrincipal = new Principal(cliente, indice);
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositarBtnMouseClicked

    private void txtDescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescrActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositarBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextField txtDescr;
    private javax.swing.JPanel txtclave;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean validación(String pin1, String pin2) {
        return pin1.equals(pin2);
    }
}
