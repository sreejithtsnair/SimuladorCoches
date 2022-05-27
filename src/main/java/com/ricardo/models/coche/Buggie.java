package com.ricardo.models.coche;

public class Buggie extends Coche implements CocheI{

    public Buggie(String marca, String tipo, int velocidad, float CV) {
        super(marca, tipo, velocidad, CV);
    }

    @Override
    public double avanzar(int kms) {
        return 0;
    }

    @Override
    public boolean arrancar() {
        return false;
    }

    @Override
    public boolean parar() {
        return false;
    }

    public boolean frenar(){
        return true;
    }
}
