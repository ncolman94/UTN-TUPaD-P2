/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca '" + this.nombre + "'.");
    }

    public void listarLibros() {
        System.out.println("\n=== Libros en la Biblioteca: " + this.nombre + " ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        System.out.println("===========================================");
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro aEliminar = buscarLibroPorIsbn(isbn);
        if (aEliminar != null) {
            libros.remove(aEliminar);
            System.out.println("Libro '" + aEliminar.getTitulo() + "' eliminado de la biblioteca.");
        } else {
            System.out.println("Error: No se encontró libro con ISBN " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== Libros publicados en el año " + anio + " ===");
        boolean encontrados = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay libros publicados en ese año.");
        }
        System.out.println("========================================");
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== Autores en la Biblioteca: " + this.nombre + " ===");
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
        System.out.println("==========================================");
    }
}
