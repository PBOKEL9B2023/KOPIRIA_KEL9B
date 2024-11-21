package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String DB_HOST = "127.0.0.1";
    private static final String DB_NAME = "kopiria";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver!");
            e.printStackTrace();
        }
    }

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://" + DB_HOST + "/" + DB_NAME + "?useSSL=false&serverTimezone=UTC";
            return DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
            throw new RuntimeException("Database connection failed!", e);
        }
    }
}
