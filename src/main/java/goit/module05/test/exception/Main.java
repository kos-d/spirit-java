package goit.module05.test.exception;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ErrorExample errorExample = new ErrorExample();
        errorExample.foo();
        
        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.foo();
    }
}