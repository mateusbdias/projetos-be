package Aula09S_Integradora3.service;

import Aula09S_Integradora3.model.Triangulo;

import java.util.HashMap;

public class FlyweightFactory {

    public static final HashMap<String, Triangulo> trianguloMap = new HashMap<>();

    public static Triangulo obterTriangulo(String cor) {
        Triangulo triangulo = trianguloMap.get(cor);

        if (triangulo == null) {
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor, triangulo);
        }
        return triangulo;
    }

}
