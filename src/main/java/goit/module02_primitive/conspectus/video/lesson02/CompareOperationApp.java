package goit.module02_primitive.conspectus.video.lesson02;

public class CompareOperationApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a = " + a + " ; " + "b = " + b);
    
        System.out.println("a = b - " + (a == b));  //false 
        System.out.println("a < b - " + (a < b));   //true 
        System.out.println("a != b - " + (a != b)); //true

        int x = 0;                                  // x = 0
        System.out.println("x = " + x);
        
        System.out.println("x != 0 - " + (x != 0)); // false 
        
        int y = 2;                                  // y = 2
        System.out.println("y = " + y);
        
        System.out.println("y != 3 - " + (y != 3)); // true
    }
}
