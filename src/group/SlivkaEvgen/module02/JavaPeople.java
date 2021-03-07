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




       // String name = "";
     //   String city = "";
      //  int age = 0;
       // String hobby = "";

      //  Scanner in = new Scanner(System.in);

      //  System.out.println("Enter your name: ");
     //   name = in.nextLine();
        //System.out.println("Your name is: " + name);

      //  System.out.println("Enter your city: ");
      //  city = in.nextLine();
        //System.out.println("Your city is: " + city);

      //  System.out.print("Enter your age: ");
      //  age = in.nextInt();
       // System.out.println("Your age is: " + age);

      //  System.out.print("Enter your hobby: ");
      //  hobby = in.nextLine();;
        // System.out.println("Your hobby is: " + hobby);

      //  in.close();
      //  System.out.printf("Name : " + name +  "Age : " + age + "City : " + city +  "hobby : " + hobby);
    }
}
