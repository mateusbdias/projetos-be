package Aula13S_ConsultasTransacoes.service;

import Aula13S_ConsultasTransacoes.model.Conta;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;

public class ContaService {

    private static final Logger LOGGER = Logger.getLogger(ContaService.class);

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS conta; "
            + "CREATE TABLE conta ("
            + "id int PRIMARY KEY, "
            + "nome VARCHAR(64) NOT NULL, "
            + "numConta VARCHAR(64) NOT NULL, "
            + "saldo double);";

    private static final String SQL_INSERT = "INSERT INTO conta "
            + "(id, nome, numConta, saldo) "
            + "VALUES (?, ?, ?, ?);";

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();

        Conta c1 = new Conta(1, "Bill", "5522-5", 0.0);

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Criando a tabela conta ...");
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement inserir = connection.prepareStatement(SQL_INSERT);
            inserir.setInt(1, c1.getId());
            inserir.setString(2, c1.getNome());
            inserir.setString(3, c1.getNumConta());
            inserir.setDouble(4, c1.getSaldo());
            LOGGER.info("Inserindo registro no BD ...");
            inserir.execute();
            mostrarContas(connection);

            atualizarSaldo(c1.getId(), 10.0, connection);
            mostrarContas(connection);

            atualizarSaldo(c1.getId(), 15.0, connection);
            mostrarContas(connection);
        }
        catch (Exception e) {
            LOGGER.error("Erro de acesso ao BD: " + e);
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
        return DriverManager.getConnection("jdbc:h2:mem:aula13", "sa", "");
    }

    public static void mostrarContas(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM conta;";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        LOGGER.info("Dados das contas:");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1)
            + " | Nome: " + rs.getString(2)
            + " | Conta: " + rs.getString(3)
            + " | Saldo: " + rs.getDouble(4));
        }
    }

    public static double obterSaldo(int id, Connection c) throws Exception {
        String sqlSelect = "SELECT saldo FROM conta WHERE id = ?";
        PreparedStatement ps = c.prepareStatement(sqlSelect);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getDouble(1);
    }

    public static void atualizarSaldo(int id, double valor, Connection c) throws Exception {
        String sqlUpdate = "UPDATE conta SET saldo = ? WHERE id = ?";
        PreparedStatement ps = c.prepareStatement(sqlUpdate);
        ps.setDouble(1, obterSaldo(id, c) + valor);
        ps.setInt(2, id);
        LOGGER.info("Depositando R$ " + valor);
        ps.execute();
    }

}
