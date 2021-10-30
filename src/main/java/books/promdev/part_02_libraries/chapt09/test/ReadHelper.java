package books.promdev.part_02_libraries.chapt09.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadHelper {
    
    private String file = "data\\file.txt";    
    private final File f = new File(file);    
    private int b, count = 0;
    
    FileReader is = null;
    
    public void readerHelper() {
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
            closeInputStream();
            System.out.println("InputStream close");
        }
    }
    
    private void closeInputStream() {
        try {
            if (is != null) {
                is.close();
            } 
        } catch (IOException e) {
            System.err.println("Oops! Error close!");
        }
    }
}
