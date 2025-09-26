package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Bateria b = new Bateria("BAT-01", 4000);
        Celular c = new Celular("IMEI123", "Samsung", "S22", b);
        Usuario u = new Usuario("Carlos Pérez", "38537195");

        u.setCelular(c);

        System.out.println("Celular: " + c.getMarca() + " " + c.getModelo() + " | IMEI: " + c.getImei());
        System.out.println("Bateria: " + c.getBateria().getModelo() + " - " + c.getBateria().getCapacidad() + "mAh");
        System.out.println("Usuario: " + u.getNombre() + " - DNI: " + u.getDni());
        System.out.println("Usuario -> Celular IMEI: " + u.getCelular().getImei());
    }
}
