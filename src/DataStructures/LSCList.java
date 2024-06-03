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
//Lista circular simple enlazada. Mala pero funciona para los fines
public class LSCList<T> implements Iterable<T> {

    private NodoSimple<T> first;
    private NodoSimple<T> last;
    private int count;

    public LSCList() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public void add(T data) {
        NodoSimple<T> nuevo = new NodoSimple<>(data);
        if (this.first == null) {
            this.first = this.last = nuevo;
            this.count = 1;
            return;
        }
        nuevo.next = this.first;
        this.last.next = nuevo;
        this.first = nuevo;
        this.count++;
    }

    //El método esta feuco pero funciona para los propósitos
    public T remove(T data) {
        if (isEmpty()) {
            return null;
        }
        NodoSimple<T> prev = this.first;
        NodoSimple<T> current = prev.next;
        do {
            if (current.data.equals(data)) {
                prev.next = prev.next.next;
                this.count--;
                return current.data;
            }
            prev = prev.next;
            current = prev.next;
        } while (current != this.first);
        return null;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LSCLIterator();
    }

    public Iterator<T> iterarContinuo() {
        return new LSCLIteratorContinuo();
    }

    private class LSCLIterator implements Iterator<T> {

        private NodoSimple<T> head = first;
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
    }

    //Iterador que sigue y sigue y sigue
    private class LSCLIteratorContinuo implements Iterator<T> {

        private NodoSimple<T> head = first;

        @Override
        public boolean hasNext() {
            return this.head != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            T data = this.head.data;
            this.head = head.next;
            return data;
        }
    }
}
