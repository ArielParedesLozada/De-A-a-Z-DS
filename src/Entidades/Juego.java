package Entidades;

import DataStructures.LDCList;
import DataStructures.LSCList;
import DataStructures.LinkedPila;

//El juego en sí
public class Juego {

    public LDCList<String> listaJugadores;
    public LinkedPila<String> pilaPerdedores;
    public LSCList<Character> colaLetras;
    public int duracion;
    public final int DURACION_DEFAULT = 15;
    private static Juego instancia;

    private Juego() {
        this.listaJugadores = new LDCList<>();
        this.pilaPerdedores = new LinkedPila<>();
        this.colaLetras = new LSCList<>();
        for (char c = 'z'; c >= 'a'; c--) {
            this.colaLetras.add(c);
        }
        this.duracion = this.DURACION_DEFAULT;
    }

    public static synchronized Juego getJuego() {
        if (instancia == null) {
            instancia = new Juego();
        }
        return instancia;
    }
    
    public void refresh(){
        instancia = null;
    }
}
