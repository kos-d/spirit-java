package module05.conspectus.video.lesson04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
    public static void main(String[] args) {
        readFile("src/main/resources/file1.txt");
    }
    
    private static void readFile(String filePath) {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println(reader.readLine());
//            System.exit(1);
        } catch (IOException e){
            System.out.println("Impossible to read file");
        }
    }
    
    /*
    private static void readFile(String filePath) {
        File file = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            System.out.println(reader.readLine());
        } catch (IOException e){
            System.out.println("Impossible to read file");
            //e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    */
}