package Ejercicio13;

public class Main {
    
    public static void main(String[] args) {
        Usuario u = new Usuario("Juan Pérez", "juan@example.com");
        GeneradorQR g = new GeneradorQR();
        g.generar("QR-123456", u);
    }
}
