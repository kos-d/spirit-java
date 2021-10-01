package books.promdev.part_01_core.chapt01.homework;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        
        String name = createScanner();
        
        welcome(name);
        
    }
    public static void welcome(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static String createScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.nextLine();
        return name;
    }
}