package Aula12S_Integradora4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static final String SQLCREATETABLE = "DROP TABLE IF EXISTS usuario; "
            + "CREATE TABLE usuario ("
            + "id INT PRIMARY KEY, "
            + "nome VARCHAR(32) NOT NULL, "
            + "sobrenome VARCHAR(64) NOT NULL, "
            + "idade INT NOT NULL)";

    private static final String SQLINSERT1 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (1, 'John', 'Lennon', 81)";

    private static final String SQLINSERT2 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (2, 'Ringo', 'Starr', 81)";

    private static final String SQLINSERT3 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (3, 'George', 'Harrison', 79)";

    private static final String SQLINSERT4 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (4, 'Paul', 'McCartney', 79)";

    public static void main(String[] args) throws Exception {

        // Configuração padrão do Log4j
        BasicConfigurator.configure();

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Criando o BD ...");
            statement.execute(SQLCREATETABLE);
            LOGGER.info("Inserindo os dados ...");
            statement.execute(SQLINSERT1);
            statement.execute(SQLINSERT2);
            statement.execute(SQLINSERT3);
            statement.execute(SQLINSERT4);
            showUsers(connection);
            deleteById(2, connection);
            showUsers(connection);
        }
        catch (Exception e) {
            LOGGER.error("Erro na execução do bloco Try: " + e);
        }
        finally {
            if (connection == null) {
                return;
            }
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:aula12", "sa", "");
    }

    public static void showUsers(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM usuario";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        LOGGER.info("Visualizando os dados ...");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " | "
            + rs.getString(2) + " | "
            + rs.getString(3) + " | "
            + rs.getInt(4));
        }
    }

    public static void deleteById(int id, Connection connection) throws Exception {
        String sqlDelete = "DELETE FROM usuario WHERE id = " + id;
        Statement statement = connection.createStatement();
        LOGGER.info("Deletando o registro com id " + id + " ...");
        statement.execute(sqlDelete);
    }

}
