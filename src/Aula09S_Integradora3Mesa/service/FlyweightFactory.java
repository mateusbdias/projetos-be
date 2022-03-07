package Aula09S_Integradora3Mesa.service;

import Aula09S_Integradora3Mesa.model.Roupa;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    public static final Map<String, Roupa> mapRoupasXS = new HashMap<>();
    public static final Map<String, Roupa> mapRoupasS = new HashMap<>();
    public static final Map<String, Roupa> mapRoupasM = new HashMap<>();
    public static final Map<String, Roupa> mapRoupasImp = new HashMap<>();
    public static final Map<String, Roupa> mapRoupasMasCond = new HashMap<>();

    public Roupa getRoupa(String tamanho, String tipo, boolean nova, boolean imp) {
        Roupa roupa = null;
        if (tamanho.equalsIgnoreCase("xs")) {
            roupa = mapRoupasXS.get(tipo);

            if (roupa == null) {
                roupa = new Roupa(tamanho, tipo, nova, imp);
                mapRoupasXS.put(tipo, roupa);
                System.out.println("Roupa inserida na lista XS");
            }
            System.out.println("Roupa XS recuperada da memória");
        } else if (tamanho.equalsIgnoreCase("s")) {
            roupa = mapRoupasS.get(tipo);

            if (roupa == null) {
                roupa = new Roupa(tamanho, tipo, nova, imp);
                mapRoupasS.put(tipo, roupa);
                System.out.println("Roupa inserida na lista S");
            }
            System.out.println("Roupa S recuperada da memória");
        } else if (tamanho.equalsIgnoreCase("m")) {
            roupa = mapRoupasM.get(tipo);

            if (roupa == null) {
                roupa = new Roupa(tamanho, tipo, nova, imp);
                mapRoupasM.put(tipo, roupa);
                System.out.println("Roupa inserida na lista M");
            }
            System.out.println("Roupa M recuperada da memória");
        }
        if (imp) {
            roupa = mapRoupasImp.get(tipo);

            if (roupa == null) {
                roupa = new Roupa(tamanho, tipo, nova, imp);
                mapRoupasImp.put(tipo, roupa);
                System.out.println("Roupa inserida na lista Importados");
            }
            System.out.println("Roupa Importada recuperada da memória");
        }
        if (!nova) {
            roupa = mapRoupasMasCond.get(tipo);

            if (roupa == null) {
                roupa = new Roupa(tamanho, tipo, nova, imp);
                mapRoupasMasCond.put(tipo, roupa);
                System.out.println("Roupa inserida na lista Más Condições");
            }
            System.out.println("Roupa em Más Condições recuperada da memória");
        }
        return roupa;
    }

}
