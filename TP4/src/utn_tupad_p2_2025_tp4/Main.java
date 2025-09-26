/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utn_tupad_p2_2025_tp4;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(100, "Ana Lopez", "Desarrolladora", 75000);
        Empleado e2 = new Empleado("Carlos Carrizo", "Tester");
        Empleado e3 = new Empleado("Lucía Ávalos", "Analista");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        e1.actualizarSalario(10);
        e2.actualizarSalario(5000);
        e3.actualizarSalario(20);

        System.out.println("\nDespués de aumentar salarios:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\nTotal de empleados creados: "
                + Empleado.mostrarTotalEmpleados());
    }
}
