package Aula05S_Proxy.model;

import Aula05S_Proxy.service.ServicoVacinarProxy;
import Aula05S_Proxy.service.Vacinar;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Date dataVac = new Date();

    @Test
    public void vac() {
        Pessoa p1 = new Pessoa("Christh", "Teixeira", "12345",
                dataVac, "Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1);
    }

}