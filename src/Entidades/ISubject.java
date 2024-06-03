/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public interface ISubject {
    public void add(IObserver observer);
    public void delete(IObserver observer);
    public void notificar();
}
