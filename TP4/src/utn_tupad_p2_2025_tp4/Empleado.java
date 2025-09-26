/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn_tupad_p2_2025_tp4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int siguienteId = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= siguienteId) {
            siguienteId = id + 1;
        }
    }

    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100.0);
        }
    }

    public void actualizarSalario(int montoFijo) {
        if (montoFijo > 0) {
            this.salario += montoFijo;
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre
                + ", Puesto=" + puesto + ", Salario=$" + salario + "]";
    }
}
