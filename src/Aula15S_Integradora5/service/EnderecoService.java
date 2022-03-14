package Aula15S_Integradora5.service;

import Aula15S_Integradora5.dao.IDao;
import Aula15S_Integradora5.model.Endereco;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco) {
        enderecoIDao.salvar(endereco);
        return endereco;
    }

}
