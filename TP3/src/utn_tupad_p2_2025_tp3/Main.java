/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp3;

public class Main {
    public static void main(String[] args) {
        // Estudiante
        Estudiante est = new Estudiante("Ana", "Pérez", "Programación I", 7);
        est.mostrarInfo();
        est.subirCalificacion(2);
        est.bajarCalificacion(5);
        est.mostrarInfo();

        // Mascota
        Mascota mascota = new Mascota("Luna", "Gato", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        // Libro
        Libro libro = new Libro("El Quijote", "Cervantes", 1605);
        libro.mostrarInfo();
        libro.setAnioPublicacion(-200);
        libro.setAnioPublicacion(2005);
        libro.mostrarInfo();

        // Gallina
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 3);
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        // NaveEspacial
        NaveEspacial nave = new NaveEspacial("Explorer", 50);
        nave.mostrarEstado();
        nave.avanzar(10);
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(15);
        nave.mostrarEstado();
    }
}
