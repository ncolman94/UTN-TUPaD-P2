/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");

        Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A02", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A03", "Jorge Luis Borges", "Argentina");

        System.out.println("--- 3. Agregando libros ---");
        miBiblioteca.agregarLibro("978-030735044", "Cien años de soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-849759220", "El amor en los tiempos del cólera", 1985, autor1);
        miBiblioteca.agregarLibro("978-006112241", "La casa de los espíritus", 1982, autor2);
        miBiblioteca.agregarLibro("978-987566648", "Ficciones", 1944, autor3);
        miBiblioteca.agregarLibro("978-842063311", "El Aleph", 1949, autor3);

        System.out.println("\n--- 4. Listando todos los libros ---");
        miBiblioteca.listarLibros();

        System.out.println("\n--- 5. Buscando libro por ISBN '978-006112241' ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-006112241");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }

        System.out.println("\n--- 6. Filtrando libros publicados en 1944 ---");
        miBiblioteca.filtrarLibrosPorAnio(1944);

        System.out.println("\n--- 7. Eliminando libro con ISBN '978-842063311' ---");
        miBiblioteca.eliminarLibro("978-842063311");
        miBiblioteca.listarLibros();

        System.out.println("\n--- 8. Cantidad total de libros ---");
        System.out.println("La biblioteca tiene " + miBiblioteca.obtenerCantidadLibros() + " libros.");

        System.out.println("\n--- 9. Listando autores disponibles ---");
        miBiblioteca.mostrarAutoresDisponibles();
    }
}
