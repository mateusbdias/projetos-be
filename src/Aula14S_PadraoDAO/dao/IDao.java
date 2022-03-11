package Aula14S_PadraoDAO.dao;

public interface IDao<T> {
    public T salvar(T t);
}
