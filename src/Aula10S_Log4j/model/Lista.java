package Aula10S_Log4j.model;

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Lista {

    private static final Logger logger = Logger.getLogger(Lista.class);
    private ArrayList<Integer> listaInteiros = new ArrayList<>();

    public void addNumero(int numero) {
        listaInteiros.add(numero);
    }

    public void qtdNumeros() throws Exception {
        if (listaInteiros.size() > 10) {
            logger.info("A lista tem mais de 10 itens!");
        } else if (listaInteiros.size() > 5) {
            logger.info("A lista tem mais de 5 itens!");
        } else if (listaInteiros.size() == 0) {
            logger.error("A lista está vazia!");
            throw new Exception();
        }
    }

    public void media() {
        int total = 0;
        for (int item: listaInteiros) {
            total += item;
        }
        int media = total / listaInteiros.size();
        logger.info("A média da lista é: " + media);
    }

}
