/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazjuegoaz;

import Entidades.HiloJuego;
import Entidades.Juego;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.DefaultListModel;


/**
 *
 * @author Usuario
 */
public class PantallaFinal extends javax.swing.JFrame {

    private Juego juego;
    private Point initialLocation;

    private void setListaPerdedores() {
        DefaultListModel<String> perdedores = new DefaultListModel<>();
        while (!this.juego.pilaPerdedores.isEmpty()) {
            perdedores.addElement(this.juego.pilaPerdedores.pop());
        }
        this.jListPerdedores.setModel(perdedores);
    }

    private void setGanador() {
        String ganador = juego.listaJugadores.iterator().next();
        this.jLblNombreGanador.setText(ganador);
    }


    /**
     * Creates new form PantallaFinal
     */
    public PantallaFinal() {
        this.juego = Juego.getJuego();
        initComponents();
        setListaPerdedores();
        setGanador();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Guarda la ubicación inicial de la ventana
        initialLocation = getLocation();

        // Añade un ComponentListener para interceptar el movimiento de la ventana
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                // Restaura la ventana a su ubicación inicial
                setLocation(initialLocation);
            }
        });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnl0 = new javax.swing.JPanel();
        jLblFinal = new javax.swing.JLabel();
        jLblGanador = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPerdedores = new javax.swing.JList<>();
        jLblNombreGanador = new javax.swing.JLabel();
        jLblGanador1 = new javax.swing.JLabel();
        jLblTurnoParticipante1 = new javax.swing.JLabel();
        jLblFinal1 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPnl0.setBackground(new java.awt.Color(204, 204, 255));

        jLblFinal.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 36)); // NOI18N
        jLblFinal.setText("LISTADO FINAL");

        jLblGanador.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 24)); // NOI18N
        jLblGanador.setText("GANADOR: ");

        jListPerdedores.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jListPerdedores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListPerdedores);

        jLblNombreGanador.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N

        jLblGanador1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 24)); // NOI18N
        jLblGanador1.setText("ELIMINADOS:");

        jLblTurnoParticipante1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 24)); // NOI18N
        jLblTurnoParticipante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        jLblFinal1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 36)); // NOI18N
        jLblFinal1.setText("DE JUGADORES ");

        jBtnConfirmar.setBackground(new java.awt.Color(255, 153, 102));
        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTNCONFIRMAR.png"))); // NOI18N
        jBtnConfirmar.setContentAreaFilled(false);
        jBtnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnl0Layout = new javax.swing.GroupLayout(jPnl0);
        jPnl0.setLayout(jPnl0Layout);
        jPnl0Layout.setHorizontalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblTurnoParticipante1)
                        .addGap(38, 38, 38)
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLblFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)))
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblGanador1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblGanador))
                        .addGap(18, 18, 18)
                        .addComponent(jLblNombreGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl0Layout.createSequentialGroup()
                        .addComponent(jBtnConfirmar)
                        .addGap(263, 263, 263))))
        );
        jPnl0Layout.setVerticalGroup(
            jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl0Layout.createSequentialGroup()
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTurnoParticipante1)
                    .addGroup(jPnl0Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPnl0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLblGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblNombreGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLblGanador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jBtnConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        HiloJuego.getHiloJuego().currentFrame.dispose();
        PantallaJuego pj = new PantallaJuego();
        pj.setVisible(true);
        HiloJuego.getHiloJuego().refresh();
        dispose();
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JLabel jLblFinal;
    private javax.swing.JLabel jLblFinal1;
    private javax.swing.JLabel jLblGanador;
    private javax.swing.JLabel jLblGanador1;
    private javax.swing.JLabel jLblNombreGanador;
    private javax.swing.JLabel jLblTurnoParticipante1;
    private javax.swing.JList<String> jListPerdedores;
    private javax.swing.JPanel jPnl0;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
