/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp2;

import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.next().trim().toUpperCase();

        double porcentaje = switch (cat) {
            case "A" -> 0.10;
            case "B" -> 0.15;
            case "C" -> 0.20;
            default -> 0.0;
        };
        double descuento = precio * porcentaje;
        double finalConDesc = precio - descuento;

        System.out.println("Descuento aplicado: " + (porcentaje * 100) + "%");
        System.out.println("Precio final: " + finalConDesc);
    }
}
