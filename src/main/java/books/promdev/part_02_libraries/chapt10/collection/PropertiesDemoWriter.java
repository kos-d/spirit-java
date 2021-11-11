package books.promdev.part_02_libraries.chapt10.collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoWriter {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
//            props.setProperty("db.driver", "com.mysql.jdbc.Driver");
            props.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
            props.setProperty("db.user", "root");
            props.setProperty("db.password", "pass");
            props.setProperty("db.poolsize", "5");
            
            props.store(new FileWriter("prop" + File.separator + "database.properties"), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}