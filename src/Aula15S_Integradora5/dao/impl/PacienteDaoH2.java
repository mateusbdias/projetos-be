package Aula15S_Integradora5.dao.impl;

import Aula15S_Integradora5.dao.IDao;
import Aula15S_Integradora5.dao.config.ConfigJDBC;
import Aula15S_Integradora5.model.Paciente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDaoH2 implements IDao<Paciente> {

    private ConfigJDBC configJDBC;

    public PacienteDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        Connection connection = configJDBC.connectToDB();
        Statement st = null;
        String query = String.format(
                "INSERT INTO pacientes " +
                "(nome, sobrenome, rg, data_cadastro, id_endereco) " +
                "VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                paciente.getDataCadastro(),
                paciente.getIdEndereco()
        );
        try {
            st = connection.createStatement();
            st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = st.getGeneratedKeys();
            if (keys.next()) {
                paciente.setId(keys.getInt(1));
            }
            st.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return paciente;
    }
}
