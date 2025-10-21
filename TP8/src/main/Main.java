/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import ecommerce.*;
import pagos.*;
import excepciones.EdadInvalidaException;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- PARTE 1: INTERFACES Y POO ---");
        probarEcommerce();

        System.out.println("\n--- PARTE 2: MANEJO DE EXCEPCIONES ---");
        probarManejoExcepciones();
        probarLecturaArchivo();
    }

    public static void probarEcommerce() {
        Producto p1 = new Producto("Laptop Gamer", 1500.0);
        Producto p2 = new Producto("Mouse Inalámbrico", 50.0);
        Cliente cliente = new Cliente("Ana Torres");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        double totalOriginal = pedido.calcularTotal();
        System.out.println("Pedido creado. Total original: $" + totalOriginal);

        TarjetaCredito pagoTarjeta = new TarjetaCredito();
        double totalConDescuento = pagoTarjeta.aplicarDescuento(totalOriginal);
        System.out.println("Total con descuento de Tarjeta: $" + totalConDescuento);

        if (pagoTarjeta.procesarPago(totalConDescuento)) {
            pedido.cambiarEstado("PAGADO");
        } else {
            pedido.cambiarEstado("FALLO_PAGO");
        }

        PayPal pagoPaypal = new PayPal();
        pagoPaypal.procesarPago(100.0);
    }

    public static void probarManejoExcepciones() {
        System.out.println("\n-> Probando División Segura:");
        System.out.println("Resultado 10/2: " + ManejoExcepciones.dividir(10, 2));
        System.out.print("Resultado 10/0: ");
        ManejoExcepciones.dividir(10, 0);

        System.out.println("\n-> Probando Conversión:");
        System.out.println("Conversión '123': " + ManejoExcepciones.convertirANumero("123"));
        System.out.print("Conversión 'hola': ");
        ManejoExcepciones.convertirANumero("hola");

        System.out.println("\n-> Probando Edad Inválida:");
        try {
            ManejoExcepciones.validarEdad(30);
            ManejoExcepciones.validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.err.println("Excepción Capturada (Regla de Negocio): " + e.getMessage());
        }
    }

    public static void probarLecturaArchivo() {
        System.out.println("\n-> Probando Lectura de Archivo (try-with-resources):");
        LectorDeArchivos.leerArchivoConRecursos("archivo.txt");
    }
}
