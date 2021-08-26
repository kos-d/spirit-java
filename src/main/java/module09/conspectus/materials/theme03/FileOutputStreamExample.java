package module09.conspectus.materials.theme03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void writeFileOutputStream() {
        String text = "Hello from Output Stream";
        
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
//            fileOutputStream.write(buffer[0]);                // H
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        writeFileOutputStream();
    }
}