package com.ricardo.persistencia;

import com.ricardo.models.coche.Coche;
import com.ricardo.models.coche.CocheI;

import java.util.ArrayList;
import java.util.List;

public class AlmacenCoches {
    private static List<Coche> coches = new ArrayList();

    //CRUD
    public static boolean addCoche(Coche coche) {
        coches.add(coche);
        return true;
    }

    public static boolean removeCoche(Coche coche) {
        return true;
    }

    public static Coche getCoche(String marca, String tipo) {
        Coche resultado = null;

        for (Coche unCoche : coches) {
            if (unCoche.getMarca().equals(marca) && unCoche.getTipo().equals(tipo)) {
                resultado=unCoche;
                break;
            }
        }

        return resultado;
    }

    public static Coche updateCoche(Coche coche) {
        return null;
    }

    public static List<Coche> getCoches() {
        return coches;
    }
}
