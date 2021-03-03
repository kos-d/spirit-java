package module02.scanner;

import java.lang.String;        // use class String
import java.lang.System;        // use class System, methods: .in(), .out()

import java.io.PrintStream;     // use method .println()

import java.util.Random;        // use class Random, method .nextInt()
import java.util.Scanner;       // use class Scanner, method .nextInt()


public class GuessTheNumberApp {               
    public static void main(String[] args) {
        Random random = new Random();           
        Scanner scan = new Scanner(System.in);
        do {  
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print("Enter the number 0..9-> ");
                guess = scan.nextInt();
                if (number != guess) {
                    System.out.println("Your N is " + ((guess > number) ? "greater" : "less"));
                    count++;
                }
            
            }
            System.out.println("Your " + ((count == 3) ? "lose!" : "WIN!" ));
            System.out.println("Repeat game? Yes - 1, No - 0");
        } while (scan.next().equals("1"));
    }
}
