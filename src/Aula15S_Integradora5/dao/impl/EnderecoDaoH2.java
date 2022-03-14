package Aula15S_Integradora5.dao.impl;

import Aula15S_Integradora5.dao.config.ConfigJDBC;
import Aula15S_Integradora5.dao.IDao;
import Aula15S_Integradora5.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDaoH2 implements IDao<Endereco> {

    private ConfigJDBC configJDBC;

    public EnderecoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection connection = configJDBC.connectToDB();
        Statement st = null;
        String query = String.format(
                "INSERT INTO enderecos " +
                "(rua, numero, cidade, bairro) " +
                "VALUES ('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getCidade(),
                endereco.getBairro()
        );
        try {
            st = connection.createStatement();
            st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = st.getGeneratedKeys();
            if (keys.next()) {
                endereco.setId(keys.getInt(1));
            }
            st.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return endereco;
    }
}
