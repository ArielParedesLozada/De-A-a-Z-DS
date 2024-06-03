/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import interfazjuegoaz.PantallaFinal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
//Esta clase es el hilo de ejecución principal del juego
public class HiloJuego implements Runnable, ISubject {

    public Juego juego;
    public boolean esperaValidacion;
    public boolean respuestaCorrecta;
    public String currentRespuesta;
    public Character currentLetra;
    public String currentJugador;
    private Iterator<String> jugadores;
    private Iterator<Character> letras;
    private ArrayList<IObserver> observadores;
    private static HiloJuego instance;
    public int tiempoRestante; // Añadir esta variable
    public javax.swing.JFrame currentFrame; // Añadir una referencia a la ventana actual
    public boolean juegoTerminado; // Añadir una bandera para indicar si el juego ha terminado

    private HiloJuego() {
        this.juego = Juego.getJuego();
        this.observadores = new ArrayList<>();
        this.jugadores = this.juego.listaJugadores.iterarContinuo();
        this.letras = this.juego.colaLetras.iterarContinuo();
        this.esperaValidacion = false;
        this.respuestaCorrecta = true;
        this.juegoTerminado = false;
    }

    public static synchronized HiloJuego getHiloJuego() {
        if (instance == null) {
            instance = new HiloJuego();
        }
        return instance;
    }

    //Reinicia todo
    public void refresh() {
        System.out.println("Se reinicia todo");
        this.juego.refresh();
        instance = null;
    }

    // Método para establecer la ventana actual
    public void setCurrentFrame(javax.swing.JFrame frame) {
        this.currentFrame = frame;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (!juegoTerminado && this.jugadores.hasNext()) {
                this.respuestaCorrecta = false;
                // Inicializar el tiempo restante
                this.tiempoRestante = this.juego.duracion;
                // Se pasa al siguiente jugador, letra y se actualizan las cosas
                avanzarTurno();
                notificar();
                // Actualizar el tiempo restante
                while (this.tiempoRestante > 0 && !Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                        this.tiempoRestante--;
                        notificar();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("El hilo fue interrumpido durante el sleep");
                        return;
                    }
                }
                // Si la respuesta no es correcta, se le quita y pone en la pila de perdedores
                if (this.tiempoRestante == 0 || !this.respuestaCorrecta) {
                    removerJugadorActual();  // Remover el jugador actual si la respuesta es incorrecta
                    notificar();
                }
            }

            // Push al final para que se imprima bonito
            if (!juegoTerminado && this.juego.listaJugadores.size() == 1) {
               mostrarReporte();
            }
        }
    }

    // Método para mostrar el reporte del juego y regresar a la pantalla anterior
    private void mostrarReporte() {
        System.out.println("Se acabó el juego");
        this.juegoTerminado = true;
        PantallaFinal pf = new PantallaFinal();
        pf.setVisible(true);
    }

    // Método para avanzar el turno
    private void avanzarTurno() {
        this.currentJugador = this.jugadores.next();
        this.currentLetra = this.letras.next();
    }

    // Método para remover al jugador actual
    public synchronized void removerJugadorActual() {
        this.juego.pilaPerdedores.push(this.currentJugador);
        System.out.println("Se removió a " + this.currentJugador);
        this.jugadores.remove();
    }

    // Pausa la ejecución del hilo
    public synchronized void pausar() {
        this.esperaValidacion = true;
        notifyAll();
    }

    // Reanuda la ejecución del hilo y notifica a todo el sistema
    public synchronized void reanudar() {
        this.esperaValidacion = false;
        notifyAll();
    }

    // Basura del patrón Observer
    @Override
    public void add(IObserver observer) {
        this.observadores.add(observer);
    }

    @Override
    public void delete(IObserver observer) {
        this.observadores.remove(observer);
    }

    @Override
    public void notificar() {
        for (IObserver observador : this.observadores) {
            observador.update();
        }
    }
}
