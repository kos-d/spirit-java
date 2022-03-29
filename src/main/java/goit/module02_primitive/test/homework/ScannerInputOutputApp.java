package goit.module02_primitive.test.homework;

import java.util.Scanner;

public class ScannerInputOutputApp {
    Scanner scanner = new Scanner(System.in);
    
    public void scannerInputOutput() {

//    String name;
//    String city;
//    int age;
//    String hobby = "test";

    System.out.print("Input your name: ");
    String name = scanner.nextLine();
    System.out.print("Input your city: ");
    String city = scanner.nextLine();
    System.out.print("Input your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Input your hobby: ");
    String hobby = scanner.nextLine();
    
    System.out.printf("Name: %s \nCity: %s \nAge: %d \nHobby: %s \n", name, city, age, hobby);

    scanner.close();
    }
    public static void main(String[] args) {
        //new ScannerInputOutputApp().scannerInputOutput();
        ScannerInputOutputApp scannerInputOutputApp = new ScannerInputOutputApp();
        scannerInputOutputApp.scannerInputOutput();
    }
}
