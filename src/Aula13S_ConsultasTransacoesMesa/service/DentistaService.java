package Aula13S_ConsultasTransacoesMesa.service;

import Aula13S_ConsultasTransacoesMesa.model.Dentista;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;

public class DentistaService {

    private static final Logger LOGGER = Logger.getLogger(DentistaService.class);

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS dentista; "
            + "CREATE TABLE dentista ("
            + "id INT PRIMARY KEY, "
            + "nome VARCHAR(64) NOT NULL, "
            + "sobrenome VARCHAR(64) NOT NULL, "
            + "matricula VARCHAR(10) NOT NULL);";

    private static final String SQL_INSERT = "INSERT INTO dentista "
            + "(id, nome, sobrenome, matricula) "
            + "VALUES (?, ?, ?, ?);";

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();

        Dentista dent = new Dentista(1, "John", "Doe", "123456-7");

        Connection conn = null;

        try {
            conn = getConnection();
            Statement st = conn.createStatement();
            LOGGER.info("Criando a tabela dentista ...");
            st.execute(SQL_CREATE_TABLE);

            PreparedStatement inserir = conn.prepareStatement(SQL_INSERT);
            inserir.setInt(1, dent.getId());
            inserir.setString(2, dent.getNome());
            inserir.setString(3, dent.getSobrenome());
            inserir.setString(4, dent.getMatricula());
            LOGGER.info("Inserindo registro no BD ...");
            inserir.execute();
            mostrarDentistas(conn);

            alterarMatricula(dent.getId(), "120983-6", conn);
            mostrarDentistas(conn);
        }
        catch (Exception e) {
            LOGGER.error("Erro de acesso ao BD: " + e);
        }
        finally {
            if (conn == null) {
                return;
            }
            conn.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:aula13mesa", "sa", "");
    }

    public static void mostrarDentistas(Connection conn) throws Exception {
        String sqlSelect = "SELECT * FROM dentista;";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sqlSelect);
        LOGGER.info("Dados dos dentistas:");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1)
            + " | Nome: " + rs.getString(2)
            + " | Sobrenome: " + rs.getString(3)
            + " | Matrícula: " + rs.getString(4));
        }
    }

    public static void alterarMatricula(int id, String valor, Connection conn) throws Exception {
        String sqlUpdate = "UPDATE dentista SET matricula = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sqlUpdate);
        ps.setString(1, valor);
        ps.setInt(2, id);
        LOGGER.info("Atualizando a matrícula do id " + id);
        ps.execute();
    }

}
