package offtop.nix;

import java.util.Scanner;

public class Calc {
    
    private int a = 0;
    private int b = 0;
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two number:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = sum(num1, num2);
        System.out.println("Result sum = " + result);
    }
    
    private static int sum(int a, int b) {
        return a + b;
    }
    
    private static void readArguments(String[] args) {
        for (String str : args) {
            
        }
    }
}