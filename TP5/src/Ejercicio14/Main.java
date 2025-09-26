package Ejercicio14;

public class Main {
    
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Video Promocional", 15);
        EditorVideo ev = new EditorVideo();
        ev.exportar("MP4", p);
    }
}
