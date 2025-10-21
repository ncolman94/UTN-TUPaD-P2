/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import excepciones.EdadInvalidaException;

public class ManejoExcepciones {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        }
        System.out.println("Edad validada: " + edad);
    }

    public static double dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage() + ". No se puede dividir por cero.");
            return 0;
        }
    }

    public static int convertirANumero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.err.println("Error: El texto '" + texto + "' no es un número entero válido.");
            return -1;
        }
    }
}
