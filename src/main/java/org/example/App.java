package org.example;

import com.ricardo.models.Coche;
import com.ricardo.models.Deportivo;
import com.ricardo.models.Familiar;
import com.ricardo.models.Todoterreno;
import com.ricardo.utils.Ordenador;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final int DISTANCIA = 100;

        Familiar coche1 = new Familiar("Renault", "Berlina", 100, 90, 7);
        Todoterreno coche2 = new Todoterreno("Toyota", "4x4", 90, 120, 2);
        Deportivo coche3 = new Deportivo("Porsche", "Deportivo", 180, 120, true);
        

        coche1.arrancar();
        coche2.arrancar();
        coche3.arrancar();

        double tiempo1 = coche1.avanzar(DISTANCIA);
        double tiempo2 = coche2.avanzar(DISTANCIA);
        double tiempo3 = coche3.avanzar(DISTANCIA);

        System.out.println("Tiempos:" + tiempo1 + " " + tiempo2 + " " + tiempo3);

        int idGanador = Ordenador.encontrarMasRapido(tiempo1, tiempo2, tiempo3);
        String ganador = idGanador == 1 ? coche1.getMarca() : (idGanador == 2 ? coche2.getMarca() : coche3.getMarca());

        coche1.parar();
        coche2.parar();
        coche3.parar();

        System.out.println("El ganador es:" + ganador);

    }
}
