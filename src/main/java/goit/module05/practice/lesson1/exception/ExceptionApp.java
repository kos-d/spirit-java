package goit.module05.practice.lesson1.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) throws CheckException {
//--------------------------------------------------------------        
//        try {
//            int result = calc(1, 0);
//            System.out.println("result = " + result);
//        } catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException " + ex);
//        } catch (NullPointerException e) {
//            System.out.println("*******");
//            System.out.println(e);
//        }
//--------------------------------------------------------------
        // multicatch
//        try {
//            int result = calc(1, 0);
//            System.out.println("result = " + result);
//        } catch (ArithmeticException | NullPointerException ex) {
//            System.out.println("ArithmeticException " + ex);
//        } catch (Exception e) {
//            System.out.println("Exception " + e);
//        }
//--------------------------------------------------------------       
        //uncheck exception
//        try {
//            int result = calc(1, 0);
//            System.out.println("result = " + result);
//        } catch (ArithmeticException | NullPointerException ex) {
//            throw new UncheckException();
//        }
//--------------------------------------------------------------       
        //check exception
        try {
            int result = calc1(1, 0);
            System.out.println("result = " + result);
        } catch (CheckException e) {
            System.out.println("CheckException");
            System.out.println("e " + e);
        }

        //finally
        Scanner scanner = null;        
        try {
            scanner = new Scanner(new File("example.txt"));
            //todo
        } catch (FileNotFoundException e) {
            //todo
        }
        finally {
            scanner.close();
        }
        //try with resource
               
        try (Scanner scannerNew = new Scanner(new File("example.txt"))) { //AutoCloseable
            //todo
        } catch (FileNotFoundException e) {
            //todo
        }
   }
    
    public static int calc(int a, int b) {
        int result =  a / b;
        return result;
    }
    
    //check exception
    public static int calc1(int a, int b) throws CheckException {
        try {
            int result =  a / b;
            return result;
        } catch (ArithmeticException ex) {
            throw new CheckException();
        }
    }
}