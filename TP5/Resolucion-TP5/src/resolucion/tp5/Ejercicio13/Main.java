/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio13;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Elena Soto", "elena@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("ABC-123", user); // dependencia de creación

    }
}
