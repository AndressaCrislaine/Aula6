package com.wcc.model;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Montador montador = new Montador();
        List<Placa> placas = montador.montarPlacas(5);
        System.out.println(placas.toString());
    }
}
