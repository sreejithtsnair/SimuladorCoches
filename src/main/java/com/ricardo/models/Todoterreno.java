package com.ricardo.models;

public class Todoterreno extends Coche {

    private int cambios;
    public Todoterreno(String marca, String tipo, int velocidad, float CV, int cambios) {
        super(marca, tipo, velocidad, CV);
        this.cambios=cambios;
    }

    public double avanzar(int kms) {
        if(encendido) return (double) kms / (double) velocidad * (CV / 0.5);
        else return  Double.POSITIVE_INFINITY;
    }
}
