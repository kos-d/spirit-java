package library;

import java.lang.Object;
import java.lang.System;
import java.lang.String;

import java.io.Console;
import java.util.Scanner;

public class LibraryClasses {

    public static void main(String[] args) {
        System.out.printf("test");

        Object object = new Object();
        System.gc();
        String string = new String();

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();


    }
}
