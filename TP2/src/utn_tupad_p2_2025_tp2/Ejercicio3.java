/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int e = sc.nextInt();
        String etapa = (e < 12) ? "Niño"
                      : (e <= 17) ? "Adolescente"
                      : (e <= 59) ? "Adulto"
                      : "Adulto mayor";
        System.out.println("Eres un " + etapa + ".");
    }
}
