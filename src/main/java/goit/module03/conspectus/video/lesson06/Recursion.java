package goit.module03.conspectus.video.lesson06;

public class Recursion {
    
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println("Factorial: -> " + factorial);
    }
    
    public static int factorial (int number) {
        if (number == 0 || number == 1) {
            return 1;            
        }
        int result = number * factorial(number - 1);
        return result;
    }
}