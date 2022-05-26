package com.ricardo.models;

public class Deportivo extends Coche {
    private boolean turbo;

    public Deportivo(String marca, String tipo, int velocidad, float CV, boolean turbo) {
        super(marca, tipo, velocidad, CV);
        this.turbo = turbo;
    }

    public double avanzar(int kms) {
        if (encendido) return (double) kms / (double) velocidad * (CV / 100) / (turbo ? 1.5 : 1);
        else return Double.POSITIVE_INFINITY;
    }
}
