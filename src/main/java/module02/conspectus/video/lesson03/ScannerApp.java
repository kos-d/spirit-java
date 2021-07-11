package module02.conspectus.video.lesson03;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. Please follow steps below.");
        System.out.println("Input your email:");        
        String email = scanner.nextLine();        
        System.out.println("Input your name:");
        String name = scanner.nextLine();
        System.out.println("Input your age:");
        int age = scanner.nextInt();
        
        System.out.println("Thank you " + name + ". Your email " + email + ", age " + age);
    }
}