/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        System.out.println("--- 1. Agregando productos ---");
        inventario.agregarProducto(new Producto("E01", "Smart TV 55\"", 2800.00, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A01", "Leche Entera 1L", 950.50, 150, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("R01", "Camisa de Lino", 1500.00, 40, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H01", "Juego de Sábanas", 2100.00, 30, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("E02", "Auriculares Bluetooth", 890.99, 80, CategoriaProducto.ELECTRONICA));

        System.out.println("\n--- 2. Listando todos los productos ---");
        inventario.listarProductos();

        System.out.println("\n--- 3. Buscando producto con ID 'R01' ---");
        Producto buscado = inventario.buscarProductoPorId("R01");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        System.out.println("\n--- 4. Filtrando por categoría ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n--- 5. Eliminando producto 'A01' ---");
        inventario.eliminarProducto("A01");
        inventario.listarProductos();

        System.out.println("\n--- 6. Actualizando stock de 'E01' a 10 unidades ---");
        inventario.actualizarStock("E01", 10);

        System.out.println("\n--- 7. Mostrando el total de stock ---");
        System.out.println("El stock total de todos los productos es: " + inventario.obtenerTotalStock());

        System.out.println("\n--- 8. Mostrando producto con mayor stock ---");
        Producto conMayorStock = inventario.obtenerProductoConMayorStock();
        if (conMayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            conMayorStock.mostrarInfo();
        }

        System.out.println("\n--- 9. Filtrando productos con precio entre $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n--- 10. Mostrando categorías y sus descripciones ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
