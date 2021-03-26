package module02.conspectus.materials.simple_scan;

import java.util.Scanner;

public class ScanApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();

        /*
        next(): считывает введенную строку до первого пробела
        nextLine(): считывает всю введенную строку
        nextInt(): считывает введенное число int
        nextDouble(): считывает введенное число double
        nextBoolean(): считывает значение boolean
        nextByte(): считывает введенное число byte
        nextFloat(): считывает введенное число float
        nextShort(): считывает введенное число short
        */
    }
}
