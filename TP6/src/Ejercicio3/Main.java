/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN");

        Profesor prof1 = new Profesor("P01", "Juan Pérez", "Programación");
        Profesor prof2 = new Profesor("P02", "Ana Gómez", "Bases de Datos");
        Profesor prof3 = new Profesor("P03", "Luis Martin", "Redes");

        Curso curso1 = new Curso("C01", "Programación I");
        Curso curso2 = new Curso("C02", "Bases de Datos I");
        Curso curso3 = new Curso("C03", "Programación II");
        Curso curso4 = new Curso("C04", "Redes de Computadoras");
        Curso curso5 = new Curso("C05", "Sistemas Operativos");

        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);
        utn.agregarCurso(curso1);
        utn.agregarCurso(curso2);
        utn.agregarCurso(curso3);
        utn.agregarCurso(curso4);
        utn.agregarCurso(curso5);

        System.out.println("\n--- 3. Asignando profesores a cursos ---");
        utn.asignarProfesorACurso("C01", "P01");
        utn.asignarProfesorACurso("C03", "P01");
        utn.asignarProfesorACurso("C02", "P02");
        utn.asignarProfesorACurso("C04", "P03");

        System.out.println("\n--- 4. Listados después de asignación inicial ---");
        utn.listarCursos();
        utn.listarProfesores();

        System.out.println("\n--- 5. Cambiando profesor de 'Programación II' a Ana Gómez ---");
        utn.asignarProfesorACurso("C03", "P02");
        System.out.println("\n--- Verificando la sincronización... ---");
        utn.listarProfesores();

        System.out.println("\n--- 6. Removiendo el curso 'Redes de Computadoras' (C04) ---");
        utn.eliminarCurso("C04");
        System.out.println("\n--- Verificando la lista de cursos del profesor Luis Martin... ---");
        utn.buscarProfesorPorId("P03").listarCursos();

        System.out.println("\n--- 7. Removiendo al profesor Juan Pérez (P01) ---");
        utn.eliminarProfesor("P01");
        System.out.println("\n--- Verificando el curso 'Programación I' (C01)... ---");
        utn.buscarCursoPorCodigo("C01").mostrarInfo();

        System.out.println("\n--- 8. Reporte final de cursos por profesor ---");
        utn.listarProfesores();
    }
}
