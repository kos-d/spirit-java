package module09_io.conspectus.materials.theme03;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {
    public static void readFile() {
        try (FileReader reader = new FileReader("test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void readFileWithBuffer() {
        try (FileReader fileReader = new FileReader("test.txt")) {
            char[] buf = new char[256];
            int count;
            
            while((count = fileReader.read(buf)) > 0) {
                if (count < 256) {
                    buf = Arrays.copyOf(buf, count);
                }
                System.out.println(Arrays.toString(buf));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
//        readFile();
        readFileWithBuffer();
    }
}