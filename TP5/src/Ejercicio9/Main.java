package Ejercicio9;

public class Main {
    
    public static void main(String[] args) {
        Paciente p = new Paciente("Lucía Fernández", "OSDE");
        Profesional pr = new Profesional("Dr. Ramírez", "Cardiología");
        CitaMedica c = new CitaMedica("2025-10-01", "10:30", p, pr);
        
        System.out.println("Cita Médica: " + c.getFecha() + " a las " + c.getHora());
        System.out.println("Paciente: " + c.getPaciente().getNombre() + " - Obra Social: " + c.getPaciente().getObraSocial());
        System.out.println("Profesional: " + c.getProfesional().getNombre() + " - Especialidad: " + c.getProfesional().getEspecialidad());
    }
}
