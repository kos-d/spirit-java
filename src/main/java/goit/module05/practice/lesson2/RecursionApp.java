package goit.module05.practice.lesson2;

public class RecursionApp {
    public static void main(String[] args) {
        
        int factorial = factorial(5);
        System.out.println("factorial 5 = " + factorial);
        int factorialRecursion = factorialRecursion(5);
        System.out.println("factorialRecursion 5 = " + factorialRecursion(5));
        
    }
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i; 
        }
        return result;
    }
    public static int factorialRecursion(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursion(num - 1);
    }
}