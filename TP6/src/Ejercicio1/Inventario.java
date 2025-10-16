/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }

    public void listarProductos() {
        System.out.println("\n=== Listado de Productos en Inventario ===");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
        System.out.println("==========================================");
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto aEliminar = buscarProductoPorId(id);
        if (aEliminar != null) {
            productos.remove(aEliminar);
            System.out.println("Producto '" + aEliminar.getNombre() + "' eliminado.");
        } else {
            System.out.println("Error: No se encontró un producto con el ID " + id);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto aActualizar = buscarProductoPorId(id);
        if (aActualizar != null) {
            aActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto '" + aActualizar.getNombre() + "' actualizado a " + nuevaCantidad);
        } else {
            System.out.println("Error: No se encontró un producto con el ID " + id);
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n=== Productos de la categoría: " + categoria.name() + " ===");
        boolean encontrados = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay productos en esta categoría.");
        }
        System.out.println("==========================================");
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n=== Productos con precio entre $" + min + " y $" + max + " ===");
        boolean encontrados = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
        System.out.println("================================================");
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n=== Categorías Disponibles ===");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + ": " + cat.getDescripcion());
        }
        System.out.println("===============================");
    }
}
