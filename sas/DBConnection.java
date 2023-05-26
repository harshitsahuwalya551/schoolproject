/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sas;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ravi9
 */
class DBConnection {
     private static DBConnection instance = null;
    private java.sql.Connection connection;

    private DBConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sas"; // Change this to your database URL
        String username = "root"; // Change this to your database username
        String password = ""; // Change this to your database password
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public static DBConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public java.sql.Connection getConnection() {
        return connection;
    }
}
