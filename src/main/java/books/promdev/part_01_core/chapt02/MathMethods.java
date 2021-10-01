package books.promdev.part_01_core.chapt02;

public class MathMethods {
    public static void main(String[] args) {
        final int MAX_VALUE = 10;
        double d;
        d = Math.random() * MAX_VALUE;
        System.out.println("d = " + d);
        System.out.println("Rounded whole = " + Math.round(d));
        System.out.println("Nearest whole, " + " <= original number = " + Math.floor(d));
        System.out.println("Nearest whole, " + " >= original number = " + Math.ceil(d));
        System.out.println("Closest integer value " + " to the number = " + Math.rint(d));
        
        int randomInt;
        randomInt = (int) (Math.random() * MAX_VALUE);
        
        System.out.println("randomInt = " + randomInt);
    }
}