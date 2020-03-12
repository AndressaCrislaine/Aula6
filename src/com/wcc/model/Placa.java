package com.wcc.model;

import java.util.ArrayList;
import java.util.List;

public class Placa {

    List<Componente> componentes = new ArrayList<Componente>();

    public void addComponente(Componente componente){
        componentes.add(componente);
    }

    @Override
    public String toString() {
        return componentes.toString() + "\n";
    }
}
