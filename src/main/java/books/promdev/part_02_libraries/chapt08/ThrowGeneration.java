package books.promdev.part_02_libraries.chapt08;

import java.io.File;

public class ThrowGeneration {
    public static void connectFile(File file) {
        if (file == null || !file.exists()) throw new IllegalArgumentException();
    }
    
    public static void main(String[] args) {
//        File f = new File("demo.txt");
        File f = null;
        try {
            connectFile(f);
        } catch (IllegalArgumentException e) {
            System.err.print("work unchecked-" + "exception off method: " + e);
        }
    }
}
