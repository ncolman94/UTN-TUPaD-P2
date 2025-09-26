package Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Autor a = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial e = new Editorial("Sudamericana", "Buenos Aires");
        Libro l = new Libro("Cien años de soledad", "ISBN123456", a, e);

        System.out.println("Libro: " + l.getTitulo() + " - ISBN: " + l.getIsbn());
        System.out.println("Autor: " + l.getAutor().getNombre() + " (" + l.getAutor().getNacionalidad() + ")");
        System.out.println("Editorial: " + l.getEditorial().getNombre() + " - " + l.getEditorial().getDireccion());
    }
}
