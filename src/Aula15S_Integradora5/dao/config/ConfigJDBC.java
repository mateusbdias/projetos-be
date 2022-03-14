package Aula15S_Integradora5.dao.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String username;
    private String password;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String username, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.username = username;
        this.password = password;
    }

    public ConfigJDBC() {
        this.jdbcDriver = "org.H2.Driver";
        this.dbUrl = "jdbc:h2:mem:aula15;" +
                "DB_CLOSE_DELAY=-1;" +
                "INIT=RUNSCRIPT FROM 'create_aula15.sql'";
        this.username = "sa";
        this.password = "";
    }

    public Connection connectToDB() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
