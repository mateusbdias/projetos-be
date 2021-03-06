package Aula12S_Integradora4Mesa;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    private static final String SQLCREATETABLE = "DROP TABLE IF EXISTS employee; "
            + "CREATE TABLE employee ("
            + "id INT PRIMARY KEY, "
            + "name VARCHAR(32) NOT NULL, "
            + "surname VARCHAR(32) NOT NULL, "
            + "dob VARCHAR(10) NOT NULL, "
            + "dept VARCHAR(10) NOT NULL)";

    private static final String SQLINSERT1 = "INSERT INTO employee "
            + "(id, name, surname, dob, dept) "
            + "VALUES (1, 'Jason', 'Snell', '1970-01-23', 'CEO')";

    private static final String SQLINSERT2 = "INSERT INTO employee "
            + "(id, name, surname, dob, dept) "
            + "VALUES (2, 'Serenity', 'Caldwell', '1984-07-12', 'Mkt')";

    private static final String SQLINSERT3 = "INSERT INTO employee "
            + "(id, name, surname, dob, dept) "
            + "VALUES (3, 'Federico', 'Viticci', '1983-10-01', 'EiC')";

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Creating database ...");
            statement.execute(SQLCREATETABLE);
            LOGGER.info("Inserting data ...");
            statement.execute(SQLINSERT1);
            statement.execute(SQLINSERT2);
            statement.execute(SQLINSERT3);
            showEmployees(connection);
            LOGGER.info("Updating data ...");
            updateById(1, "dept", "CFO", connection);
            deleteById(3, connection);
            showEmployees(connection);
            deleteByField("surname", "Snell", connection);
            showEmployees(connection);
        }
        catch (Exception e) {
            LOGGER.error("Error while executing try block: " + e);
        }
        finally {
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:aula12mesa", "sa", "");
    }

    public static void showEmployees(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        LOGGER.info("Viewing data ...");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " | "
                    + rs.getString(2) + " | "
                    + rs.getString(3) + " | "
                    + rs.getString(4) + " | "
                    + rs.getString(5));
        }
    }

    public static String getEmployeeInfoById(int id, Connection connection) throws Exception {
        Statement statement = connection.createStatement();
        String sqlSelect = "SELECT * FROM employee WHERE id = " + id;
        String employeeInfo = "";
        ResultSet rs = statement.executeQuery(sqlSelect);
        while (rs.next()) {
            employeeInfo = rs.getInt(1) + " | "
                    + rs.getString(2) + " | "
                    + rs.getString(3) + " | "
                    + rs.getString(4) + " | "
                    + rs.getString(5);
        }
        return employeeInfo;
    }

    public static String getEmployeeInfoByField(String field, String data, Connection connection) throws Exception {
        Statement statement = connection.createStatement();
        String sqlSelect = "SELECT * FROM employee WHERE " + field + " = '" + data + "'";
        String employeeInfo = "";
        ResultSet rs = statement.executeQuery(sqlSelect);
        while (rs.next()) {
            employeeInfo = rs.getInt(1) + " | "
                    + rs.getString(2) + " | "
                    + rs.getString(3) + " | "
                    + rs.getString(4) + " | "
                    + rs.getString(5);
        }
        return employeeInfo;
    }

    public static void updateById(int id, String field, String data, Connection connection) throws Exception {
        Statement statement = connection.createStatement();
        String sqlUpdate = "UPDATE employee SET " + field + " = '" + data + "' WHERE id = " + id;
        statement.execute(sqlUpdate);
        LOGGER.debug("Updated employee: " + getEmployeeInfoById(id, connection));
    }

    public static void deleteById(int id, Connection connection) throws Exception {
        LOGGER.info("Deleting employee with id " + id + " ...");
        Statement statement = connection.createStatement();
        String employeeInfo = getEmployeeInfoById(id, connection);
        String sqlDelete = "DELETE FROM employee WHERE id = " + id;
        statement.execute(sqlDelete);
        LOGGER.info("Deleted employee: " + employeeInfo);
    }

    public static void deleteByField(String field, String data, Connection connection) throws Exception {
        LOGGER.info("Deleting employee with " + field + " " + data);
        Statement statement = connection.createStatement();
        String employeeInfo = getEmployeeInfoByField(field, data, connection);
        String sqlDelete = "DELETE FROM employee WHERE " + field + " = '" + data + "'";
        statement.execute(sqlDelete);
        LOGGER.info("Deleted employee: " + employeeInfo);
    }

}
