package com.melissakipp.lil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(String host, String databaseName, String username, String password) {
        // Constructor
        // This is not ideal for production (just for example)
        // jdbc:postgresql://localhost:5432/hplussport
        this.url = "jdbc:postgresql://" + host + "/" + databaseName;
        this.properties = new Properties();
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);
    }
    // Method
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }
}
