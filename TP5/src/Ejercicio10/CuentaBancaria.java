package Ejercicio10;

public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
    public String getCbu() {
        return cbu;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public ClaveSeguridad getClave() {
        return clave;
    }
    
    public Titular getTitular() {
        return titular;
    }
}
