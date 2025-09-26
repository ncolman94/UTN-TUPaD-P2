package Ejercicio10;

public class Titular {
    
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}
