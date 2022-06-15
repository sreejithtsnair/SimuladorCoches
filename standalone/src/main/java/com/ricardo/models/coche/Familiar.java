package com.ricardo.models.coche;

public class Familiar extends Coche implements CocheI {

    private int asientos;

    public Familiar(String marca, String tipo, int velocidad, float CV, int asientos) {
        super(marca, tipo, velocidad, CV);
        this.asientos = asientos;
    }

    public double avanzar(int kms) {
        if (encendido) return (double) kms / (double) velocidad * (CV / 120);
        else return Double.POSITIVE_INFINITY;
    }

    public boolean arrancar() {
        this.encendido = true;
        return true;
    }

    public boolean parar() {
        this.encendido = false;
        return true;
    }

}
