/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import interfaces.Pagable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // La clase Pedido debe notificarlo al cambiar de estado. [cite: 94]
        cliente.notificarCambio("El estado de su pedido ha cambiado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
