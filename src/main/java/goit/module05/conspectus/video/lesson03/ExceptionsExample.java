package goit.module05.conspectus.video.lesson03;

import java.io.FileNotFoundException;
import java.util.Objects;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            method1("someText");
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
    }

    private static void method1(String someText) throws FileNotFoundException, ClassNotFoundException {
        if (Objects.isNull(someText)) {
            throw new ClassNotFoundException();
        }
        throw new FileNotFoundException("File with name " + someText + " not found");
    }
    
    private static void method2() {
        throw new RuntimeException("Some problems");
    }
}