package Aula09S_Integradora3Mesa.service;

import Aula09S_Integradora3Mesa.model.Roupa;

import java.util.HashMap;

public class FlyweightFactory {

    public static final HashMap<String, Roupa> roupasXSMap = new HashMap<>();
    public static final HashMap<String, Roupa> roupasSMap = new HashMap<>();
    public static final HashMap<String, Roupa> roupasMMap = new HashMap<>();
    public static final HashMap<String, Roupa> roupasImpMap = new HashMap<>();
    public static final HashMap<String, Roupa> roupasMasCondMap = new HashMap<>();



/*
    public static Triangulo obterTriangulo(String cor) {
        Triangulo triangulo = trianguloMap.get(cor);

        if (triangulo == null) {
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor, triangulo);
        }
        return triangulo;
    }

*/
}
