package Ejercicio1;

import java.time.LocalDate;

public class Pasaporte {

    private String numero;
    private java.time.LocalDate fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(String numero, java.time.LocalDate fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public String getNumero() {
        return numero;
    }

    public java.time.LocalDate getFechaEmision() {
        return fechaEmision;
    }
}
    
