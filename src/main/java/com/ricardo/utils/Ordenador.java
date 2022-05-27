package com.ricardo.utils;

public class Ordenador {
    public static int encontrarMasRapido(double tiempo1,double tiempo2,double tiempo3){
        if (tiempo1 < tiempo2 && tiempo1 < tiempo3) {
            return 1;
        } else if (tiempo2 < tiempo1 && tiempo2 < tiempo3) {
            return 2;
        }else if (tiempo3 < tiempo1 && tiempo3 < tiempo2) {
            return 3;
        }
        return 0;
    }
}
