package books.promdev.part_01_core.chapt01.test;

import java.util.Scanner;

public class NumericalToBinaryApp {
//    static Integer number;
    public static void main(String[] args) {
        Integer number;
        System.out.println("Input number!");
        
//            number = System.in.read();
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            String convert = Integer.toBinaryString(number);
            System.out.println("number " + number + ": toBinary " + convert);
            scanner.close();
            System.out.println("Scanner close!");
    }
}