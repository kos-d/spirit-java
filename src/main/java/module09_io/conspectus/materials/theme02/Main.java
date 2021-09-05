package module09_io.conspectus.materials.theme02;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        File file = new File("test.txt");
        
        File newFile = new File("/");
        
        File testFile = new File("/media/disk_d/");
        
        boolean isDirTest = testFile.isDirectory();
        System.out.println("is dir test: " + isDirTest);
        
        boolean isDir = newFile.isDirectory();
        System.out.println("is dir: " + isDir);
        
        boolean file1 = file.isFile();        
        System.out.println("is file: " + file1);
        
        boolean file2 = file.exists();
        System.out.println("file exists: " + file2);
        
        String path = file.getPath();
        System.out.println("path: " + path);
        
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolute path: " + absolutePath);
        
        String canonicalPath = file.getCanonicalPath();
        System.out.println("canonical path: " + canonicalPath);
        
        boolean isDirectory = file.isDirectory();
        System.out.println("is directory: " + isDirectory);
        
        file.isDirectory();
    }
}