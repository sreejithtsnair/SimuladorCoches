package com.ricardo.models.coche;

public class Deportivo extends Coche implements CocheI {
    private boolean turbo;

    public Deportivo(String marca, String tipo, int velocidad, float CV, boolean turbo) {
        super(marca, tipo, velocidad, CV);
        this.turbo = turbo;
    }

    public double avanzar(int kms) {
        if (encendido) return (double) kms / (double) velocidad * (CV / 100) / (turbo ? 1.5 : 1);
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
