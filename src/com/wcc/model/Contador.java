package com.wcc.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contador {

    public Map<Componente,Integer> contaComponentes (List<Placa> placas){

        Map<Componente,Integer> contador = new HashMap<Componente, Integer>();
        //foreach - funciona para cada item da lista, de lista para lista
        for(Placa placa : placas){
            List<Componente> componentes = placa.getComponentes();
            for(Componente componente: componentes){
                /* Um modo de fazer

                Integer numComponentes = contador.get(componente);
                if(numComponentes == null){
                    numComponentes = 1;
                }else{
                    numComponentes += 1;
                }
                contador.put(componente,numComponentes);*/
                contador.compute(componente,(chave,valor) ->
                        valor == null ? 1 : valor +1 );
            }
        }
        return contador;
    }
}
