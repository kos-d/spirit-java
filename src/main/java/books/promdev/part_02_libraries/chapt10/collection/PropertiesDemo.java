package books.promdev.part_02_libraries.chapt10.collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.load(new FileReader("prop/database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = props.getProperty("db.driver");
        String maxIdle = props.getProperty("db.maxIdle");
        String maxActive = props.getProperty("db.maxActive", "20");
        System.out.println(driver);
        System.out.println(maxIdle);
        System.out.println(maxActive);
    }
}