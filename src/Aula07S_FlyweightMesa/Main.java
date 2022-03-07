package Aula07S_FlyweightMesa;

import Aula07S_FlyweightMesa.factory.ArvoreFactory;
import Aula07S_FlyweightMesa.model.Arvore;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArvoreFactory factory = new ArvoreFactory();

        ArrayList<Arvore> floresta = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                floresta.add(factory.getArvore("ornamental"));
            } else {
                floresta.add(factory.getArvore("frutifera"));
            }
        }

        System.out.println("Há " + floresta.size() + " árvores na floresta");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }

}
