package Ejercicio13;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado: " 
                + qr.getValor() 
                + " para " 
                + qr.getUsuario().getNombre());
    }
}
