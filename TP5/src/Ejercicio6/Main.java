package Ejercicio6;

public class Main {
    
    public static void main(String[] args) {
        Cliente c = new Cliente("Laura Fernández", "1156789012");
        Mesa m = new Mesa(12, 4);
        Reserva r = new Reserva("2025-09-26", "21:00", c, m);
        
        System.out.println("Reserva para el " + r.getFecha() + " a las " + r.getHora());
        System.out.println("Cliente: " + r.getCliente().getNombre() + " - Tel: " + r.getCliente().getTelefono());
        System.out.println("Mesa: " + r.getMesa().getNumero() + " - Capacidad: " + r.getMesa().getCapacidad());
    }
}
