package Ejercicio12;

public class Main {
    
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Laura Gómez", "27-30485503-9");
        Impuesto i = new Impuesto(15000.50, c);
        
        Calculadora calc = new Calculadora();
        calc.calcular(i);
    }
}
