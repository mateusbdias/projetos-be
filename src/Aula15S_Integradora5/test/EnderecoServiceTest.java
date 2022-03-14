package Aula15S_Integradora5.test;

import Aula15S_Integradora5.dao.config.ConfigJDBC;
import Aula15S_Integradora5.dao.impl.EnderecoDaoH2;
import Aula15S_Integradora5.model.Endereco;
import Aula15S_Integradora5.service.EnderecoService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoServiceTest {

    private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);

    private EnderecoService enderecoService = new EnderecoService(
            new EnderecoDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void configLog4j() {
        BasicConfigurator.configure();
    }

    @Disabled
    public void carregarEnderecosNaMemoria() {
        Endereco e1 = new Endereco(
                "Av. Eldorado", "2154", "São Paulo", "Morumbi"
        );
        Endereco e2 = new Endereco(
                "Av. dos Estados", "350", "São José", "Industrial"
        );
        Endereco e3 = new Endereco(
                "Rua Sepé Tiaraju", "441", "Uruguaiana", "Centro"
        );
    }

    @Test
    public void cadastrarEnderecoNoH2() {
        LOGGER.info("Cadastrando endereço ...");
        Endereco endereco1 = enderecoService.salvar(
                new Endereco("Av. Eldorado", "2154",
                        "São Paulo", "Morumbi"));
    }

}