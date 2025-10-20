/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Pérez", 3000.0));
        empleados.add(new EmpleadoTemporal("Ana Gómez", 20.0, 80));

        for (Empleado emp : empleados) {
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("Sueldo: " + emp.calcularSueldo());

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
            System.out.println("--------------------");
        }
    }
}
