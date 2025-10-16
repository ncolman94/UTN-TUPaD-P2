/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio8;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Julián Vega", "julian@mail.com");
        Documento doc = new Documento("Contrato", "Contenido del contrato...", "abc123", "2025-08-01", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());

    }
}
