package goit.module09_io.conspectus.video.lesson02.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile_FileInputStream_Example {
public static void main(String[] args) {
        
        String absolutePath = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/file1.txt";
        String filePath = "test.txt";
        
        File file = new File(filePath);
        
        if (!file.exists()) { 
            throw new RuntimeException("File with name " + file.getName() + " not exists");
        }
        
//        try (FileInputStream inputStream = new FileInputStream(absolutePath)) {
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int ch = inputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = inputStream.read();
            }
        } catch (IOException ex) {
            System.err.print(ex.getMessage());
        }
    }
}