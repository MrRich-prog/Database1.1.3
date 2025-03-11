package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/testsql";
    private static final String USERNAME = "MrRich";
    private static final String PASSWORD = "root";
    private static Connection connection;

    private Util() {
    }

    ;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
