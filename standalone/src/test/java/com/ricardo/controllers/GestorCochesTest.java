package com.ricardo.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class GestorCochesTest {

    @Test
    public void listarCoches() {
        GestorCoches gc= new GestorCoches();
        gc.listarCoches();
    }
}