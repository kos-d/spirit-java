package books.promdev.chapt01.homework;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.nextLine();
        
        welcome(name);
        
    }
    public static void welcome(String name) {
            System.out.println("Hello, " + name);
        }
}