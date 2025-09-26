package Ejercicio5;

public class Main {

    public static void main(String[] args) {
        Computadora comp = new Computadora("Dell", "SN123456", "X570", "AMD");
        Propietario prop = new Propietario("María Gómez", "38537195");

        prop.setComputadora(comp);

        System.out.println("Computadora: " + comp.getMarca() + " - Serie: " + comp.getNumeroSerie());
        System.out.println("Placa Madre: " + comp.getPlaca().getModelo() + " - Chipset: " + comp.getPlaca().getChipset());
        System.out.println("Propietario: " + prop.getNombre() + " - DNI: " + prop.getDni());
    }
}
