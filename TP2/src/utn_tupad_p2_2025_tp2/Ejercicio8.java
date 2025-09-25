/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp2;

import java.util.Scanner;

public class Ejercicio8 {
     public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double imp = precioBase * (impuestoPct / 100.0);
        double desc = precioBase * (descuentoPct / 100.0);
        return precioBase + imp - desc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double imp = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje: ");
        double desc = sc.nextDouble();
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(base, imp, desc));
    }
    
}
