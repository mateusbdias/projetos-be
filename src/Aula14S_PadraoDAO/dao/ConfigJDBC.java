package Aula14S_PadraoDAO.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfigJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:aula14;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create_aula14.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    // Método que conecta ao BD H2
    public Connection conectarComBD() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
            System.out.println("Conexão efetuada com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
