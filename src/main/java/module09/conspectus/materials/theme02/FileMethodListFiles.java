package module09.conspectus.materials.theme02;

import java.io.File;
import java.util.Arrays;

public class FileMethodListFiles {
    public static void main(String[] args) {
        
        File file = new File("test.txt");
        
        boolean isFile = file.isFile();
        System.out.println("is file: " + isFile);
        
        File fileTest = new File("/media");
        System.out.println(fileTest);
        File[] filesInHomeDrive = fileTest.listFiles();
        
        for (File name: filesInHomeDrive) {
            System.out.println("name: " + name);
        }
        
        for (int i = 0; i < filesInHomeDrive.length; i++) {
            System.out.println("second for " + filesInHomeDrive[i]);
        }
        
        System.out.println(Arrays.toString(filesInHomeDrive));
        
        
        
    }
}