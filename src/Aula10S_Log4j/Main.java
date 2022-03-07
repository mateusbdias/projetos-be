package Aula10S_Log4j;

import Aula10S_Log4j.model.Lista;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        // Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        Lista lista1 = new Lista();
        lista1.addNumero(2);
        lista1.addNumero(3);
        lista1.addNumero(5);
        lista1.addNumero(8);
        lista1.addNumero(23);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.qtdNumeros();
        lista1.media();

        Lista lista2 = new Lista();
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.qtdNumeros();
        lista2.media();

        Lista lista3 = new Lista();
        lista3.qtdNumeros();

        /*Leao leao = new Leao("Simba", 4, true);
        leao.correr();
        leao.eMaiorQue10();

        Tigre tigre = new Tigre();
        tigre.setNome("Scar");
        tigre.setIdade(11);
        tigre.correr();
        tigre.eMaiorQue10();*/
    }

}
