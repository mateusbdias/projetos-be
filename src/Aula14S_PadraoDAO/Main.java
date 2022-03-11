package Aula14S_PadraoDAO;

import Aula14S_PadraoDAO.dao.ConfigJDBC;
import Aula14S_PadraoDAO.dao.impl.MedicamentoDaoH2;
import Aula14S_PadraoDAO.model.Medicamento;
import Aula14S_PadraoDAO.service.MedicamentoService;

public class Main {

    public static void main(String[] args) {
        MedicamentoService medService = new MedicamentoService(
                new MedicamentoDaoH2(
                        new ConfigJDBC()));

        Medicamento medicamento = new Medicamento(
                "Ibuprofeno", "Aché", 395, 35.7);

        medService.salvar(medicamento);
    }

}
