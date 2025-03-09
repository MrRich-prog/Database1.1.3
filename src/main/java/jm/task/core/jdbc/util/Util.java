package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/testsql";
    private static final String USERNAME = "MrRich";
    private static final String PASSWORD = "root";

    public Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
