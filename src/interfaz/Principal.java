/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esmeralda
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAutomatico, cmdManual, cmdRecorrer};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoColumnas = new javax.swing.JTextField();
        txtNoFilas = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdRecorrer = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(102, 0, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("No. de Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("No. de Columnas:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        txtNoColumnas.setBackground(new java.awt.Color(240, 240, 240));
        txtNoColumnas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(txtNoColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 40, -1));

        txtNoFilas.setBackground(new java.awt.Color(240, 240, 240));
        txtNoFilas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(txtNoFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 360, 80));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblTabla);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 280));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 140, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(102, 0, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 0, 204));
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 450, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 470, 170));

        cmbOperaciones.setBackground(new java.awt.Color(204, 255, 255));
        cmbOperaciones.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        cmbOperaciones.setForeground(new java.awt.Color(0, 0, 204));
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recorrido 1", "Recorrido 2", "Recorrido 3", "Recorrido 4", "Recorrido 5" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(102, 0, 51))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(204, 255, 255));
        cmdCrear.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(0, 0, 204));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmdManual.setBackground(new java.awt.Color(204, 255, 255));
        cmdManual.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        cmdManual.setForeground(new java.awt.Color(0, 0, 204));
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        cmdAutomatico.setBackground(new java.awt.Color(204, 255, 255));
        cmdAutomatico.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        cmdAutomatico.setForeground(new java.awt.Color(0, 0, 204));
        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        cmdRecorrer.setBackground(new java.awt.Color(204, 255, 255));
        cmdRecorrer.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        cmdRecorrer.setForeground(new java.awt.Color(0, 0, 204));
        cmdRecorrer.setText("Recorrer");
        cmdRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRecorrerActionPerformed(evt);
            }
        });
        jPanel4.add(cmdRecorrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        cmdLimpiar.setBackground(new java.awt.Color(204, 255, 255));
        cmdLimpiar.setFont(new java.awt.Font("Segoe Script", 1, 13)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(0, 0, 204));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 510, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(917, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int nf, nc, n, sw, res;

        nc = tblTabla.getColumnCount();
        nf = tblTabla.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "] [" + j + "]").trim());
                        tblTabla.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdRecorrer, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm;

        if (txtNoFilas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite el número de filas!", 3);
            txtNoFilas.requestFocusInWindow();
        } else if (txtNoColumnas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite el número de columnas!", 3);
            txtNoColumnas.requestFocusInWindow();
        } else {

            nf = Integer.parseInt(txtNoFilas.getText());
            nc = Integer.parseInt(txtNoColumnas.getText());

            tm = (DefaultTableModel) tblTabla.getModel();

            if (nf < 5 || nf > 15) {
                Helper.mensaje(this, "¡El número de filas debe ser mayor que 4 y menor que 16 para poder realizar las operaciones!", 3);
                txtNoFilas.requestFocusInWindow();
            } else if (nc < 5 || nc > 15) {
                Helper.mensaje(this, "¡El número de columnas debe ser mayor que 4 y menor que 16 para poder realizar las operaciones!", 3);
                txtNoColumnas.requestFocusInWindow();
            } else {

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                JButton botonesH[] = {cmdAutomatico, cmdManual, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdRecorrer};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTabla.getColumnCount();
        nf = tblTabla.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTabla.setValueAt(n, i, j);
            }
        }
        JButton botonesH[] = {cmdRecorrer, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRecorrerActionPerformed
        int op, nf, nc;
        DefaultTableModel tm;

        op = cmbOperaciones.getSelectedIndex();

        nf = Integer.parseInt(txtNoFilas.getText());
        nc = Integer.parseInt(txtNoColumnas.getText());

        tm = (DefaultTableModel) tblTabla.getModel();

        switch (op) {
            case 0:
                if (nf != nc) {
                    Helper.mensaje(this, "El número de filas debe ser igual al número de columnas!", 3);
                } else if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El tañamo debe ser impar!", 3);
                } else {
                    txtResultado.setText(Helper.recorridoUno(tblTabla));
                }
                break;

            case 1:
                if (nf != nc) {
                    Helper.mensaje(this, "El número de filas debe ser igual al número de columnas!", 3);
                } else if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El tañamo debe ser impar!", 3);
                } else {
                    txtResultado.setText(Helper.recorridoDos(tblTabla));
                }
                break;

            case 2:
                if (nf != nc) {
                    Helper.mensaje(this, "El número de filas debe ser igual al número de columnas!", 3);
                } else if (nf % 2 != 0 || nc % 2 != 0) {
                    Helper.mensaje(this, "El tañamo debe ser par!", 3);
                } else {
                    txtResultado.setText(Helper.recorridoTres(tblTabla));
                }
                break;

            case 3:
                if (nf != nc) {
                    Helper.mensaje(this, "El número de filas debe ser igual al número de columnas!", 3);
                } else if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El tañamo debe ser impar!", 3);
                } else {
                    txtResultado.setText(Helper.recorridoCuatro(tblTabla));
                }
                break;

            case 4:
                if (nf != nc) {
                    Helper.mensaje(this, "El número de filas debe ser igual al número de columnas!", 3);
                } else if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El tañamo debe ser impar!", 3);
                } else {
                    txtResultado.setText(Helper.recorridoCinco(tblTabla));
                }
                break;
        }
        JButton botonesH[] = {cmdRecorrer, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdRecorrerActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNoFilas.setText("");
        txtNoColumnas.setText("");
        txtResultado.setText("");
        txtNoFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTabla);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAutomatico, cmdManual, cmdRecorrer};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdRecorrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtNoColumnas;
    private javax.swing.JTextField txtNoFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
