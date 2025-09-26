package Ejercicio7;

public class Main {
    
    public static void main(String[] args) {
        Motor m = new Motor("Nafta", "MTR-98765");
        Vehiculo v = new Vehiculo("ABC123", "Toyota Corolla", m);
        Conductor c = new Conductor("Pedro Sánchez", "LIC-12345");
        
        c.setVehiculo(v);
        
        System.out.println("Vehiculo: " + v.getModelo() + " - Patente: " + v.getPatente());
        System.out.println("Motor: " + v.getMotor().getTipo() + " - Serie: " + v.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + c.getNombre() + " - Licencia: " + c.getLicencia());
    }
}
