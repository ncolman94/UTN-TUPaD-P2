/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio5;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Luis Ramírez", "22334455");
        Computadora pc = new Computadora("HP", "SN123456", "ASUS TUF", "B450");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }

}
