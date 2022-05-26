package com.ricardo.models;

public class Coche {
    private String marca;
    private String tipo;
    protected int velocidad;
    protected float CV;

    protected boolean encendido = false;

    public Coche(String marca, String tipo, int velocidad, float CV) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.CV = CV;
    }

    public boolean arrancar() {
        this.encendido = true;
        return  true;
    }
    public double avanzar(int kms) {
        if(this.encendido) return (double) kms / (double) this.velocidad * (CV / 100);
        else return  Double.POSITIVE_INFINITY;
    }
    public boolean parar() {
        this.encendido = false;
        return  true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getCV() {
        return CV;
    }

    public void setCV(float CV) {
        this.CV = CV;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", velocidad=" + velocidad +
                ", CV=" + CV +
                ", encendido=" + encendido +
                '}';
    }
}
