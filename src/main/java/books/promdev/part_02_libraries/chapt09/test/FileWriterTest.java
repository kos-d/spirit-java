package books.promdev.part_02_libraries.chapt09.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {    
    
    public static void main(String[] args) {
        int k1 = 2;
        int k2 = 9;
        newFile(k1, k2);
    }
    
    public static void newFile(int k1, int k2) {
        String path = "data\\file1.txt";
        
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(path);
            for (int i = k1; i <= k2; i++) {
                fw.write(i);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                    System.out.println("fw close");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
