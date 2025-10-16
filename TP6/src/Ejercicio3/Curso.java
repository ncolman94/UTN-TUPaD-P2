/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }

        Profesor profesorAnterior = this.profesor;
        this.profesor = p;

        if (profesorAnterior != null) {
            profesorAnterior.eliminarCurso(this);
        }
        if (p != null) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (Código: " + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor a cargo: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: Aún no asignado");
        }
    }
}
