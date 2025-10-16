/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio11;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("Antología", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); // Dependencia de uso

    }
}
