/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazjuegoaz;

import Entidades.Juego;
import javax.swing.JOptionPane;

/**
 *
 * @author Elkinnn
 */
public class PantallaJuego extends javax.swing.JFrame {


    private Juego juego;

    /**
     * Creates new form PantallaJuego
     */
    public PantallaJuego() {
        this.juego = Juego.getJuego();
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnAgregar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jBtnIniciar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        jLblTurnoParticipante1 = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel2.setText("DE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(1, 229, 169));

        jBtnAgregar.setBackground(new java.awt.Color(255, 153, 102));
        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BOTONAGREGAR.png"))); // NOI18N
        jBtnAgregar.setAlignmentX(0.1F);
        jBtnAgregar.setContentAreaFilled(false);
        jBtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnSalir.setBackground(new java.awt.Color(255, 153, 102));
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTNSALIR.png"))); // NOI18N
        jBtnSalir.setContentAreaFilled(false);
        jBtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnIniciar.setBackground(new java.awt.Color(255, 153, 102));
        jBtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTNINICIARJUEGO.png"))); // NOI18N
        jBtnIniciar.setContentAreaFilled(false);
        jBtnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIniciarActionPerformed(evt);
            }
        });

        btnAyuda.setBackground(new java.awt.Color(255, 153, 102));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ins.png"))); // NOI18N
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jLblTurnoParticipante1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 24)); // NOI18N
        jLblTurnoParticipante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        btnConfiguracion.setBackground(new java.awt.Color(255, 153, 102));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTNCONFI.png"))); // NOI18N
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConfiguracion)
                        .addGap(101, 101, 101)
                        .addComponent(jBtnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAyuda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jBtnAgregar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jBtnIniciar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLblTurnoParticipante1)))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblTurnoParticipante1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAgregar)
                        .addGap(40, 40, 40)
                        .addComponent(jBtnIniciar)
                        .addGap(39, 39, 39)
                        .addComponent(jBtnSalir)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAyuda, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        PantallaJugadores pa = new PantallaJugadores();
        pa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIniciarActionPerformed
        if (juego.listaJugadores.size() < 2) {
            JOptionPane.showMessageDialog(this, "Mínimo dos jugadores", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            PantallaIniciarJuego pi = new PantallaIniciarJuego();
            pi.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jBtnIniciarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        PantallaInstrucciones in = new PantallaInstrucciones();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        PantallaConfiguracion pa = new PantallaConfiguracion();
        pa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnIniciar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblTurnoParticipante1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
