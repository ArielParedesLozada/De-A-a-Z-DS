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
public class LinkedPila<T> {
    private NodoSimple<T> first;
    private int count;

    public LinkedPila() {
        this.first = null;
        this.count = 0;
    }
    
    public boolean push(T data){
        NodoSimple<T> nuevo;
        try {
            nuevo = new NodoSimple(data);
        } catch (Exception e) {
            return false;
        }
        if (this.first == null) {
            this.first = nuevo;
            this.count = 1;
            return true;            
        }
        nuevo.next = this.first;
        this.first = nuevo;
        this.count++;
        return true;
    }
    
    public T pop(){
        if (this.first == null) {
            return null;
        }
        T element = this.first.data;
        this.first = this.first.next;
        this.count--;
        return element;
    }
    
    public T peek(){
        if (this.first == null) {
            return null;
        }
        return this.first.data;
    }
    
    public int size(){
        return this.count;
    }
    
    public boolean isEmpty(){
        return this.count == 0;
    }
}
