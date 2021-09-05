package module09_io.practice.lesson1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        
        //Path get = Paths.get("test.txt");        
        //List<String> readAllLines = Files.readAllLines(get);
        
        List<String> result = Files.readAllLines(Paths.get("test.txt"));
        System.out.println(result);
        
        Files.write(Paths.get("newtest.txt"), result);
    }
}