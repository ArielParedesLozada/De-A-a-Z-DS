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
public class NodoSimple<T> {
    protected T data;
    protected NodoSimple next;

    public NodoSimple() {
        this.data = null;
        this.next = null;
    }

    public NodoSimple(T data) {
        this.data = data;
        this.next = null;
    }   
}
