package Ejercicio10;

public class Main {
    
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("CBU123456789", 15000.75, "CLV-001", "2025-09-26");
        Titular t = new Titular("Martín López", "38537195");
        
        t.setCuenta(cb);
        
        System.out.println("Cuenta: " + cb.getCbu() + " - Saldo: $" + cb.getSaldo());
        System.out.println("Clave: " + cb.getClave().getCodigo() + " - Última Modificación: " + cb.getClave().getUltimaModificacion());
        System.out.println("Titular: " + t.getNombre() + " - DNI: " + t.getDni());
    }
}
