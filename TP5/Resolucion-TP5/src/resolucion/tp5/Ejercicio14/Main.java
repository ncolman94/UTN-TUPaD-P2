/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion.tp5.Ejercicio14;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Promo institucional", 3);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto); // dependencia de creación

    }
}
