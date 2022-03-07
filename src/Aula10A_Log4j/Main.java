package Aula10A_Log4j;

import Aula10A_Log4j.model.Leao;
import Aula10A_Log4j.model.Tigre;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        // Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        Leao leao = new Leao("Simba", 4, true);
        leao.correr();
        leao.eMaiorQue10();

        Tigre tigre = new Tigre();
        tigre.setNome("Scar");
        tigre.setIdade(11);
        tigre.correr();
        tigre.eMaiorQue10();
    }

}
