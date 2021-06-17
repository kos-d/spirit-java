package module03.conspectus.materials.theme01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        //Output in console
        System.out.println("Hello world!");
        System.out.println("Hello java!");
        
        int x = 5;
        int y = 6;
        System.out.println("x = " + x + "; y = " + y);
        
        //Input in console
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println("num " + num);
    }
}