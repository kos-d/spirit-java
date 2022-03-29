package goit.module03.homework.autocheck;
import java.util.Scanner;
public class PassportFormCreator {
    Scanner scanner = new Scanner(System.in);
    public void createForms() {
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.print(firstName + " " + lastName + " " + age * 10 + "\n");
        System.out.println(firstName.toUpperCase() + "\n" + lastName.toUpperCase() + "\n" + (age * 10));
        scanner.close();
    }

    public static void main(String[] args) {
        //new PassportFormCreator().createForms();
        PassportFormCreator passportFormCreator = new PassportFormCreator();
        passportFormCreator.createForms();
    }
}
