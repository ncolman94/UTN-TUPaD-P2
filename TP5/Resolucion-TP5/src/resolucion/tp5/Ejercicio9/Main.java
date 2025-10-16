/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio9;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Andrea Flores", "OSDE");
        Profesional profesional = new Profesional("Dr. Carlos Soto", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-15", "10:30");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
}
