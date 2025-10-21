/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagos;

import interfaces.PagoConDescuento;

public class TarjetaCredito implements PagoConDescuento {

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
        return true;
    }

    @Override
    public double aplicarDescuento(double total) {
        // Ejemplo de descuento del 10%
        return total * 0.90;
    }
}
