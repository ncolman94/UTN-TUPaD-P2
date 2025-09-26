package Ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);
        System.out.println("Exportando proyecto '"
                + r.getProyecto().getNombre()
                + "' en formato "
                + r.getFormato());
    }
}
