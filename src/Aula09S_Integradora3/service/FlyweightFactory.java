package Aula09S_Integradora3.service;

import Aula09S_Integradora3.model.Triangulo;
import Aula09S_Integradora3.model.Quadrado;

import java.util.HashMap;

public class FlyweightFactory {

    public static final HashMap<String, Triangulo> trianguloMap = new HashMap<>();
    public static final HashMap<Integer, Quadrado> quadradoMap = new HashMap<>();

    public static Triangulo obterTriangulo(String cor) {
        Triangulo triangulo = trianguloMap.get(cor);

        if (triangulo == null) {
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor, triangulo);
        }
        return triangulo;
    }

    public static Quadrado obterQuadrado(int tamanho) {
        Quadrado quadrado = quadradoMap.get(tamanho);

        if (quadrado == null) {
            quadrado = new Quadrado(tamanho);
            quadradoMap.put(tamanho, quadrado);
        }
        return quadrado;
    }

}
