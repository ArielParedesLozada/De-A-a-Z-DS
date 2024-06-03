/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class NodoDoble<T>{
    protected NodoDoble<T> prev;
    protected T data;
    protected NodoDoble<T> next;

    public NodoDoble() {
        this.prev = null;
        this.data = null;
        this.next = null;
    }

    public NodoDoble(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }    
}
