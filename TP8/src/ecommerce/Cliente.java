/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import interfaces.Notificable;

public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificarCambio(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}
