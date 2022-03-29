package goit.module02_primitive.homework.autocheck;

public class MarsCalculator {
    // nonStatic method sum
    public int sum(int a, int b, int c) {
        return a + (b + c);
    }
    // nonStatic method sub
    public int sub(int a, int b, int c) {
        return a - (b + c);
    }
    // nonStatic method multiply
    public int multiply(int a, int b, int c) {
        return sum(a, b, c) * sub(a, b, c);      
    }
    // nonStatic method divide
    public float divide(int a, int b, int c) {
        return sum(a, b, c) / 10f;
    }

    public static void main(String[] args) {
        MarsCalculator marsCalc = new MarsCalculator();
        System.out.println("marsCalc.sum(1, 2, 3) = " + marsCalc.sum(1, 2, 3)); 
        System.out.println("marsCalc.sub(1, 2, 3) = " + marsCalc.sub(1, 2, 3));        
        System.out.println("marsCalc.multiply(1, 2, 3) = " + marsCalc.multiply(1, 2, 3));        
        System.out.println("marsCalc.divide(1, 2, 3) = " + marsCalc.divide(1, 2, 3));        
    }
}
