package Ejercicio11;

public class Main {
    
    public static void main(String[] args) {
        Artista a = new Artista("Gustavo Cerati", "Rock");
        Cancion c = new Cancion("Crimen", a);
        
        Reproductor r = new Reproductor();
        r.reproducir(c);
    }
}
