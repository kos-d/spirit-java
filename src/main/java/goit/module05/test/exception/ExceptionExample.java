package goit.module05.test.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionExample {
    
    private Test test = new Test();
    FileInputStream fileInputStream = null;
    public void foo() {
        
        try {
            fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}