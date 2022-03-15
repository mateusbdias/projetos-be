package Aula17S_Checkpoint1.service;

import Aula17S_Checkpoint1.dao.IDao;
import Aula17S_Checkpoint1.model.Filial;

public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public IDao<Filial> getFilialIDao() {
        return filialIDao;
    }

    public Filial salvar(Filial filial) {
        filialIDao.salvar(filial);
        return filial;
    }

    public void mostrarFiliais() {
        filialIDao.mostrarFiliais();
    }
}
