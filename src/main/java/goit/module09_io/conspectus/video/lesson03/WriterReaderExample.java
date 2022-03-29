package goit.module09_io.conspectus.video.lesson03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderExample {
    
    private static final String ABSOLUTE_PATH = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/writer/fileFromResources.txt";
    
    public static void main(String[] args) {
        
        File file = new File(ABSOLUTE_PATH);
        
        checkIfFileAvailable(file);
        
        try (FileWriter writer = new FileWriter(file, true)) {  // append true or false
            writer.write("Hello World\nHow are you today?");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        try (FileReader reader = new FileReader(file)) {
            int ch = reader.read(); 
            while (ch != -1) {
                System.out.print((char) ch);
                ch = reader.read();
            }
            
        } catch (IOException ex) {
                System.err.println(ex.getMessage());
        }
    }

    private static void checkIfFileAvailable(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }        
    }
}