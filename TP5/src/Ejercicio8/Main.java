package Ejercicio8;

public class Main {
    
    public static void main(String[] args) {
        Usuario u = new Usuario("Carolina Díaz", "carolina@example.com");
        Documento d = new Documento("Contrato", "Contenido del contrato", "HASH1234", "2025-09-26", u);
        
        System.out.println("Documento: " + d.getTitulo() + " - " + d.getContenido());
        System.out.println("Firma: " + d.getFirma().getCodigoHash() + " - Fecha: " + d.getFirma().getFecha());
        System.out.println("Usuario: " + d.getFirma().getUsuario().getNombre() + " - Email: " + d.getFirma().getUsuario().getEmail());
    }
}
