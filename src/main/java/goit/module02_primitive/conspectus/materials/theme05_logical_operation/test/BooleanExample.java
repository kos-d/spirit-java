package goit.module02_primitive.conspectus.materials.theme05_logical_operation.test;

public class BooleanExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c  = 25;
        int q = 2;
        
        boolean result = (a | b) | (c < 100) & !(true) ^ (q == 5);
        
        System.out.println(result);     // true
    }
}