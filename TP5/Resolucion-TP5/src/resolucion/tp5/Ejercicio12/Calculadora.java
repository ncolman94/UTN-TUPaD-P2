/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio12;

/**
 *
 * @author rigon
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Cálculo de impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: $" + impuesto.getMonto());
    }

}
