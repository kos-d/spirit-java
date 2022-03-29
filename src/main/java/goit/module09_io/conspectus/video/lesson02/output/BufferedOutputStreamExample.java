package goit.module09_io.conspectus.video.lesson02.output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
private static final String ABSOLUTE_PATH = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/out/fileFromResources.txt";
    
    public static void main(String[] args) {
        
        File file = new File(ABSOLUTE_PATH);
        
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            String content = "This we will add to a file\nHello World!!!\nNew text";
            bufferedOutputStream.write(content.getBytes());
        } catch (IOException ex) {
            System.err.println("EXCEPTION!!! " + ex.getMessage());
        }
    }
}