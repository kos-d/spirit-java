package books.promdev.part_02_libraries.chapt09.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemoApp {
    public static void main(String[] args) {
        String file = "data\\file.txt";
        File f = new File(file);
        
        int b, count = 0;
        FileReader is = null;
        FileInputStream fis = null;
        
        try {
            is = new FileReader(f);
            while ((b = is.read()) != -1) {
                System.out.println((char) b);
                count++;
            }
            System.out.println("\n count byte = " + count);
            
        } catch (IOException e) {
            System.err.println("Oops! Error file: " + e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                } 
            } catch (IOException e) {
                System.err.println("Oops! Error close: " + e);
            }
        }
    }
}
