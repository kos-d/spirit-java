package library.test;

import java.lang.Object;
import java.lang.System;
import java.lang.String;

import java.io.Console;
import java.util.Scanner;

public class LibraryClasses {

    public static void main(String[] args) {

        Object object = new Object();
        System.gc();
        System.out.println("test");

        String string = new String();

        String firstName = "exor";
        String lastName = "bigo";
        String space = " ";

        String fullName = String.join(space, firstName.toLowerCase(), lastName.toUpperCase());
        System.out.println(fullName);

        boolean equals = firstName.equals(lastName);
        System.out.println(equals);

        boolean contains = firstName.contains("x");
        System.out.println(contains);

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();


    }
}
