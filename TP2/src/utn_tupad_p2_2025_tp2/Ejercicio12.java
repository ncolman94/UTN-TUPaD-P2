/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp2;

public class Ejercicio12 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    } 
}
