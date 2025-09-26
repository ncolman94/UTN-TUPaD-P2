/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp3;

public class NaveEspacial {
    String nombre;
    int combustible;
    final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, MAX_COMBUSTIBLE);
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " despegó 🚀. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            combustible = Math.min(combustible + cantidad, MAX_COMBUSTIBLE);
            System.out.println("Se recargó combustible. Nivel actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}