package com.wcc.model;

import java.util.Random;

public enum Componente {
    CONECTOR,
    CAPACITOR,
    SENSOR_DE_MOVIMENTO,
    RESISTORES,
    SEMICONDUTOR;

    public static Componente escolherComponente(){
        final Componente[] values = Componente.values();
        final Random random = new Random();
        return values[random.nextInt(values.length)];
    }
}
