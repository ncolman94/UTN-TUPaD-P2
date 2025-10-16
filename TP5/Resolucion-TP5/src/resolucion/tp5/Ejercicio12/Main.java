/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio12;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Carlos Peralta", "20-12345678-3");
        Impuesto impuesto = new Impuesto(50000.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto); // dependencia de uso

    }
}
