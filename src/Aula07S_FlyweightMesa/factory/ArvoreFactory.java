package Aula07S_FlyweightMesa.factory;

import Aula07S_FlyweightMesa.model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> mapArvores = new HashMap<>();

    public Arvore getArvore(String tipo) {
        if (!mapArvores.containsKey(tipo)) {
            mapArvores.put(tipo, new Arvore(tipo));
            System.out.println("Árvore plantada");
            return mapArvores.get(tipo);
        }

        System.out.println("Árvore obtida da memória");
        return mapArvores.get(tipo);
    }

}
