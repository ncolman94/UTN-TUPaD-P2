/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp1;

import java.util.Scanner;

/**
 *
 * @author ncolman@andreani.com.ar
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + ((b != 0) ? (a / b) : "No se puede dividir por cero"));
    }
}
