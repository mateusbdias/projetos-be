package Aula17S_Checkpoint1.dao.impl;

import Aula17S_Checkpoint1.dao.IDao;
import Aula17S_Checkpoint1.dao.config.ConfigJDBC;
import Aula17S_Checkpoint1.model.Filial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDaoH2 implements IDao<Filial> {

    private ConfigJDBC configJDBC;

    public FilialDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Filial salvar(Filial filial) {
        Connection connection = configJDBC.conectarBD();
        Statement st = null;
        String query = String.format(
                "INSERT INTO filiais " +
                "(nome, rua, numero, cidade, estado, cincoEstrelas) " +
                "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                filial.getNome(),
                filial.getRua(),
                filial.getNumero(),
                filial.getCidade(),
                filial.getEstado(),
                filial.isCincoEstrelas()
        );
        try {
            st = connection.createStatement();
            st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = st.getGeneratedKeys();
            if (keys.next()) {
                filial.setId(keys.getInt(1));
            }
            st.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return filial;
    }

    public void mostrarFiliais() {
        Connection connection = configJDBC.conectarBD();
        Statement st = null;
        String sqlSelect = "SELECT * FROM filiais;";
        try {
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1)
                        + " | Nome: " + rs.getString(2)
                        + " | Rua: " + rs.getString(3)
                        + " | Número: " + rs.getString(4)
                        + " | Cidade: " + rs.getString(5)
                        + " | Estado: " + rs.getString(6)
                        + " | Cinco Estrelas: " + rs.getBoolean(7));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
