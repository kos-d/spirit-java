package goit.module02_primitive.homework.autocheck;

public class BrokenKeyboardCalculator {
    
    public int add(int a, int b) {
        return a += b;
    }
    public int sub(int a, int b) {
        return a -= b;
    }
    public int multiply(int a, int b) {
        return a *= b;
    }
    public int divide(int a, int b) {
        return a /= b;
    }
    
    public static void main(String[] args) {
        BrokenKeyboardCalculator calc = new BrokenKeyboardCalculator();

        System.out.println("calc.add(5, 3) = " + calc.add(5, 3));
        System.out.println("calc.sub(8, 7) = " + calc.sub(8, 7));
        System.out.println("calc.multiply(1, 100) = " + calc.multiply(1, 100));
        System.out.println("calc.divide(8, 4) = " + calc.divide(8, 4));
    }
}
