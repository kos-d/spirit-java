package goit.module09_io.conspectus.video.lesson03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterBufferedReaderExample {
    private static final String ABSOLUTE_PATH = "/media/disk_d/general/dev/workspace/spirit-java/src/main/resources/writer/fileFromResources.txt";
    
    public static void main(String[] args) {
        
        File file = new File(ABSOLUTE_PATH);
        
        checkIfFileAvailable(file);
        
//        try (FileWriter writer = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            
            bufferedWriter.write("Hello World\nHow are you today?");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
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