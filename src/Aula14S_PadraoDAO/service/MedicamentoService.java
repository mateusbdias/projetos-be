package Aula14S_PadraoDAO.service;

import Aula14S_PadraoDAO.dao.IDao;
import Aula14S_PadraoDAO.model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento salvar(Medicamento medicamento) {
        return medicamentoIDao.salvar(medicamento);
    }
}
