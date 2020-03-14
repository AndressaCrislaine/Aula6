package com.wcc.model;

import java.util.ArrayList;
import java.util.List;

public class Placa {

    private List<Componente> componentes = new ArrayList<Componente>();

    public void addComponente(Componente componente){
        componentes.add(componente);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    @Override
    public String toString() {
        return componentes.toString() + "\n";
    }
}
