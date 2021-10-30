package books.promdev.part_02_libraries.chapt12.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaMySQLTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testphones";
        String username = "root";
        String password = "pass";
        
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
    }
}