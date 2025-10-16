/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }

    public void agregarCurso(Curso c) {
        if (c != null && !this.cursos.contains(c)) {
            this.cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && this.cursos.contains(c)) {
            this.cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + this.nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("- Ninguno");
        } else {
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + id + ", Especialidad: " + especialidad + ")");
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
}
