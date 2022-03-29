package goit.module09_io.conspectus.video.lesson02.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class BufferedInputStreamExample {
    
    private static final String ABSOLUTE_PATH = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/fileFromResources.txt";
    public static void main(String[] args) {
        
        File file = new File(ABSOLUTE_PATH);
        
        if (!file.exists()) { 
            throw new RuntimeException("File with name " + file.getName() + " not exists");
        }
        
//        try (FileInputStream inputStream = new FileInputStream(ABSOLUTE_PATH);
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            int ch = bufferedInputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = bufferedInputStream.read();
            }
        } catch (IOException ex) {
            System.err.print(ex.getMessage());
        }
    }
}