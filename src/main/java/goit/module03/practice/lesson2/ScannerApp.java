package goit.module03.practice.lesson2;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {      // hasNext() return boolean
            String nextLine = sc.nextLine();
            System.out.println("Hello " + nextLine);
            if ("exit".equals(nextLine)) break;

        }
        String nextLine = null;
        while (!"exit".equals(nextLine)) {
            nextLine = sc.nextLine();
        }
        sc.close();

        boolean x = true;
        while (!x) {    // false
            System.out.println("True");
        }
    }
}
