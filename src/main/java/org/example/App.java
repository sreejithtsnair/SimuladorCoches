package org.example;

import com.ricardo.models.Coche;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final int DISTANCIA=100;

        Coche coche1 = new Coche("Renault", "Berlina", 100, 90);
        Coche coche2 = new Coche("Toyota", "4x4", 90, 120);
        Coche coche3 = new Coche("Porsche", "Deportivo", 180, 120);

        coche1.arrancar();
        coche2.arrancar();
        coche3.arrancar();

        double tiempo1 = coche1.avanzar(DISTANCIA);
        double tiempo2 = coche2.avanzar(DISTANCIA);
        double tiempo3 = coche3.avanzar(DISTANCIA);

        System.out.println("Tiempos:" + tiempo1+" "+tiempo2+" "+tiempo3);

        String ganador = "";

        if (tiempo1 < tiempo2 && tiempo1 < tiempo3) {
            ganador = coche1.getMarca();
        } else if (tiempo2 < tiempo1 && tiempo2 < tiempo3) {
            ganador = coche2.getMarca();
        }else if (tiempo3 < tiempo1 && tiempo3 < tiempo2) {
            ganador = coche3.getMarca();
        }

        coche1.parar();
        coche2.parar();
        coche3.parar();

        System.out.println("El ganador es:" + ganador);

    }
}
