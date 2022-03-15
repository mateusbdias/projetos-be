package Aula17S_Checkpoint1.test;

import Aula17S_Checkpoint1.dao.config.ConfigJDBC;
import Aula17S_Checkpoint1.dao.impl.FilialDaoH2;
import Aula17S_Checkpoint1.model.Filial;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Aula17S_Checkpoint1.service.FilialService;

class FilialServiceTest {

    private static final Logger LOGGER = Logger.getLogger(FilialServiceTest.class);

    private FilialService filialService = new FilialService(
            new FilialDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void configLog4j() {
        BasicConfigurator.configure();
    }

   @Test
    public void cadastrarFiliais() {
        LOGGER.info("Salvando filial ...");
        Filial f1 = filialService.salvar(new Filial(
                "Filial Paulistana", "Av. Paulista", "1000", "São Paulo", "SP", true));
        LOGGER.info("Cadastrada " + f1.getNome() + ", id " + f1.getId());
        LOGGER.info("Salvando filial ...");
        Filial f2 = filialService.salvar(new Filial(
                "Filial Campinas", "Av. Moraes Salles", "1234", "Campinas", "SP", false));
        LOGGER.info("Cadastrada " + f2.getNome() + ", id " + f2.getId());
        LOGGER.info("Salvando filial ...");
        Filial f3 = filialService.salvar(new Filial(
                "Filial Rio Grande", "Av. Júlio de Castilhos", "342-A", "Gramado", "RS", true));
        LOGGER.info("Cadastrada " + f3.getNome() + ", id " + f3.getId());
        LOGGER.info("Salvando filial ...");
        Filial f4 = filialService.salvar(new Filial(
                "Filial Ipanema", "Av. Atlântica", "80", "Rio de Janeiro", "RJ", true));
        LOGGER.info("Cadastrada " + f4.getNome() + ", id " + f4.getId());
        LOGGER.info("Salvando filial ...");
        Filial f5 = filialService.salvar(new Filial(
                "Filial Marília", "Rua Carlos Gomes", "540", "Marília", "SP", false));
        LOGGER.info("Cadastrada " + f5.getNome() + ", id " + f5.getId());
        LOGGER.info("Dados das filiais:");
        filialService.mostrarFiliais();
    }



}