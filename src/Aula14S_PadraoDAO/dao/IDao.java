package Aula14S_PadraoDAO.dao;

import java.sql.Connection;

public interface IDao<T> {
    public T salvar(T t);

    public void pesquisarId(T t);
}
