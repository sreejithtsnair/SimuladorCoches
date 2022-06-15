package com.ricardo.models.coche;

public class Ranchera extends Coche implements CocheI {

    public Ranchera(String marca, String tipo, int velocidad, float CV) {
        super(marca, tipo, velocidad, CV);
    }

    @Override
    public double avanzar(int kms) {
        if(encendido) return (double) kms / (double) velocidad * (CV / 150);
        else return  Double.POSITIVE_INFINITY;
    }

    @Override
    public boolean arrancar() {
        return false;
    }

    @Override
    public boolean parar() {
        return false;
    }
}
