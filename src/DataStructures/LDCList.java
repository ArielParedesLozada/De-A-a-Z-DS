/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import java.util.Iterator;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class LDCList<T> implements Iterable<T> {

    private NodoDoble<T> first;
    private int count;

    public LDCList() {
        this.first = null;
        this.count = 0;
    }

    public boolean contains(Object data) {
        if (this.first == null) {
            return false; // Lista vacía
        }
        NodoDoble<T> current = this.first;
        do {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        } while (current != this.first);
        return false;
    }

    public boolean add(T data) {
        NodoDoble<T> nuevo;
        try {
            nuevo = new NodoDoble<>(data);
        } catch (Exception e) {
            return false;
        }
        if (this.first == null) {
            this.first = nuevo;
            nuevo.next = nuevo.prev = nuevo;
            this.count = 1;
            return true;
        }
        nuevo.next = this.first;
        nuevo.prev = this.first.prev;
        this.first.prev.next = nuevo;
        this.first.prev = nuevo;
        this.first = nuevo;
        this.count++;
        return true;
    }

    private void removeNodo(NodoDoble<T> nodo) {
        if (this.count == 0) {
            return;
        }
        if (nodo == this.first && this.count == 1) {
            this.first = null;
            this.count = 0;
            return;
        }
        nodo.prev.next = nodo.next;
        nodo.next.prev = nodo.prev;
        if (nodo == this.first) {
            this.first = this.first.next;
        }
        this.count--;
    }

    public boolean removeAt(int index) {
        if (this.first == null || index < 0) {
            return false;
        }
        index = index % this.count;
        int i = 0;
        NodoDoble current = this.first;
        while (i < index) {
            if (i == index) {
                removeNodo(current);
                return true;
            }
            i++;
            current = current.next;
        }
        return false;
    }

    //Remueve todas las ocurrencias de la cosa
    public boolean remove(T data) {
        if (this.first == null) {
            return false;
        }
        boolean k = false;
        NodoDoble<T> current = this.first;
        while (this.first != null && current.next != this.first) {
            if (current.data.equals(data)) {
                removeNodo(current);
                k = true;
            }
            current = current.next;
        }
        if (this.first.prev.data.equals(data)) {
            removeNodo(this.first.prev);
        }
        return k;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    //"Revuelve" los elementos pero de a mentis
    public void shuffle() {
        int random = (int) (Math.random() * this.count);
        NodoDoble<T> current = this.first;
        for (int i = 0; i < random; i++) {
            current = current.next;
        }
        this.first = current;
    }

    @Override
    public Iterator<T> iterator() {
        return new LDCListIterator();
    }

    public Iterator<T> iterarContinuo() {
        return new LDCLIteratorContinuo();
    }

    /*Iteradores*/
    //Iterador que sigue hasta que se vuelve al inicio
    private class LDCListIterator implements Iterator<T> {

        private NodoDoble<T> head = first;
        private boolean atFirst = true;

        @Override
        public boolean hasNext() {
            return this.head != null && (this.atFirst || this.head != first);
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            T data = this.head.data;
            this.head = this.head.next;
            this.atFirst = false;
            return data;
        }

        @Override
        public void remove() {
            if (this.head != null) {
                NodoDoble<T> toRemove = this.head.prev;
                this.head = this.head.next;
                removeNodo(toRemove);
            }
        }
    }

    //Iterador que sigue y sigue y sigue...
    //Modificado para que funcione ESPECÍFICAMENTE PARA EL JUEGO
    //NO TOCAR
    private class LDCLIteratorContinuo implements Iterator<T> {

        private NodoDoble<T> current = first;

        @Override
        public boolean hasNext() {
            return count > 1 && current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            T data = current.data;
            current = current.next;
            return data;
        }

        //Se asume que se utilizó el método next() anteriormente
        //Vale asumir esto por la naturaleza del Iterador y la lista
        @Override
        public void remove() {
            if (hasNext()) {
                removeNodo(current.prev);
            }
        }
    }
}
