package Oleksandr_Bielov.module02;

import java.util.Scanner;

public class NewQuestionary {

    public static void main(String[] args) {
        //Main vars declaration
        String name = "";
        String city = "";
        int age = 0;
        double height = 0.0;
        String hobby = "";

        //Create Scanner object for user inputs
        Scanner in = new Scanner(System.in);

        //Start system dialogue and assign data to variables
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        System.out.print("Please enter your city of residence: ");
        city = in.nextLine();
        System.out.print("Please enter your hobby or hobbies: ");
        hobby = in.nextLine();
        System.out.print("Please enter your age: ");
        age = in.nextInt();
        System.out.print("Please enter your height: ");
        height = in.nextDouble();

        //close input for user
        in.close();

        //Output data
        System.out.printf(" Name: %s\n City: %s\n Hobby: %s\n Age: %d\n Height: %.2f \n", name, city, hobby, age, height);

    }

}
