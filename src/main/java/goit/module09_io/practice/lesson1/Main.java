package goit.module09_io.practice.lesson1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        //InputStream fileInputStream = new FileInputStream("path");
        
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        
        BufferedInputStream bufferedInputStream = 
                new BufferedInputStream(new FileInputStream("path"));
        
        //new BufferedInputStream(FileInputStream);
        
        
        
        
    }
}