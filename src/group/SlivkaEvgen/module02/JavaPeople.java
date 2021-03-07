package SlivkaEvgen.module02;

import java.util.Scanner;

public class JavaPeople {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your city: ");
        String city = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your hobby: ");
        String hobby = in.next();
        in.close();
        System.out.println("Name: " + name + "\ncity: " + city + "\nAge: "  + age + "\nHobby: " + hobby);
       // in.close();
        System.out.println("Человек по имени " + name + " живет в городе " + city + ". \nЭтому человеку "  + age + " лет и любит он заниматьс " + hobby + ".");
        System.out.println(name + " - Name \n" + city + " - city \n" + age + " - Age \n" + hobby + " - Hobby ");

    }
}
