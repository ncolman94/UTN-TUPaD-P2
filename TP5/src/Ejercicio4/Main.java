package Ejercicio4;

public class Main {

    public static void main(String[] args) {
        Banco b = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito t = new TarjetaDeCredito("1234-5678-9012-3456", "12/27", b);
        Cliente c = new Cliente("Juan Pérez", "38537195");

        c.setTarjeta(t);

        System.out.println("Tarjeta: " + t.getNumero() + " - Vence: " + t.getFechaVencimiento());
        System.out.println("Cliente: " + c.getNombre() + " - DNI: " + c.getDni());
        System.out.println("Banco: " + t.getBanco().getNombre() + " - CUIT: " + t.getBanco().getCuit());
    }
}
