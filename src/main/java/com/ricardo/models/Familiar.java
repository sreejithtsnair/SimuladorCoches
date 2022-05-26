package com.ricardo.models;

public class Familiar extends Coche{

    private int asientos;
    public Familiar(String marca, String tipo, int velocidad, float CV, int asientos) {
        super(marca, tipo, velocidad, CV);
        this.asientos=asientos;
    }

    public double avanzar(int kms) {
        if(encendido) return (double) kms / (double) velocidad * (CV / 120);
        else return  Double.POSITIVE_INFINITY;
    }
}
