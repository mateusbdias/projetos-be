package Aula14S_PadraoDAO.dao.impl;

import Aula14S_PadraoDAO.dao.ConfigJDBC;
import Aula14S_PadraoDAO.dao.IDao;
import Aula14S_PadraoDAO.model.Medicamento;

import java.sql.*;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfigJDBC configJDBC;

    public MedicamentoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        Connection connection = configJDBC.conectarComBD();
        Statement statement = null;

        String query = String.format(
                "INSERT INTO medicamentos " +
                "(nome, laboratorio, qtd, preco) " +
                "VALUES ('%s', '%s', '%s', '%s')",
                medicamento.getNome(),
                medicamento.getLaboratorio(),
                medicamento.getQtd(),
                medicamento.getPreco()
        );

        try {
            statement = connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                medicamento.setId(keys.getInt(1));
            }
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return medicamento;
    }

}
