package com.ricardo.controllers;

import com.ricardo.models.coche.*;
import com.ricardo.persistencia.AlmacenCoches;

import java.util.List;

public class GestorCoches {
    public void listarCoches(){
        List<Coche> losCoches = AlmacenCoches.getCoches();

        losCoches.add(new Familiar("Renault","familiar", 120, 90,5));
        losCoches.add(new Buggie("Renault","deportivo", 120, 90));
        losCoches.add(new Deportivo("Renault","4x4", 120, 120,true));

        System.out.println("Mostrando lista de coches....");
        for (Coche unCoche: losCoches) {
            System.out.println(unCoche);
        }

        System.out.println("Encontrando un coches....");
        Coche unCoche=AlmacenCoches.getCoche("Renault","ranchera");
        System.out.println(unCoche);

    }
}
