package module09.conspectus.materials.theme03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void writeFile() {
        File file = new File("test.txt");
        // try with-resources
        try (FileWriter writer = new FileWriter(file, true)) {
            String text = "Hello, World!";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        writeFile();
    }
}