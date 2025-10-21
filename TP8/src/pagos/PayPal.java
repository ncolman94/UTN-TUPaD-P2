/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagos;

import interfaces.Pago;

public class PayPal implements Pago {

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por $" + monto);
        return true;
    }
}
