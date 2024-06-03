/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */

//Observador del la letra y el jugador. Actualiza la wea
public class JLblObservador implements IObserver {

    private HiloJuego subject;
    private JLabel cajaTexto;
    private boolean esLetra;

    public JLblObservador(JLabel jLbl, boolean tipo) {
        this.subject = HiloJuego.getHiloJuego();
        this.cajaTexto = jLbl;
        this.esLetra = tipo;
    }

    @Override
    public void update() {
        if (this.esLetra) {
            this.cajaTexto.setText(this.subject.currentLetra.toString());
        } else {
            this.cajaTexto.setText(this.subject.currentJugador);
        }
    }
}
