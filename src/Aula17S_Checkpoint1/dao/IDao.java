package Aula17S_Checkpoint1.dao;

public interface IDao<T> {

    public T salvar(T t);

    void mostrarFiliais();
}
