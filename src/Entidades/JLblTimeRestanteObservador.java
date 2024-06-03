/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author diego
 */
public class JLblTimeRestanteObservador implements IObserver {

    private HiloJuego subject;
    private JLabel cajaTexto;
    private JLabel lblExito;
    private Timer timer;

    public JLblTimeRestanteObservador(JLabel jLbl, JLabel lblExito) {
        this.subject = HiloJuego.getHiloJuego();
        this.cajaTexto = jLbl;
        this.lblExito = lblExito;
    }

    @Override
    public void update() {
        int tiempoRestante = this.subject.tiempoRestante;
        this.cajaTexto.setText(Integer.toString(tiempoRestante));
        if (tiempoRestante == 0) {
            this.lblExito.setText("Tiempo agotado");
            this.lblExito.setForeground(Color.BLACK);
            iniciarTemporizador();
        } else {
            this.lblExito.setText(""); // Limpiar el mensaje si no es 0
            if (timer != null) {
                timer.stop();
            }
        }
    }

    private void iniciarTemporizador() {
        if (timer != null) {
            timer.stop();
        }
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblExito.setText("");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}
