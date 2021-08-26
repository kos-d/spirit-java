package module09.conspectus.materials.theme03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void readFileWithInputStream() {
        try (FileInputStream fileInputStream = new FileInputStream("test.txt")) {
            System.out.println("File size is bytes: " + fileInputStream.available());
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char) buffer[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        readFileWithInputStream();
    }
}