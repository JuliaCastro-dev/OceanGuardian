package org.oceanGuardian.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

public class databaseContext {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm96828", "Julia24");
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return connection;
    }
}
