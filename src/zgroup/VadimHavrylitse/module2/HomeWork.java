package VadimHavrylitse.module2;

import java.util.Scanner;

public class HomeWork {
    static String name;
    static String city;
    static int age;
    static String hobby;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, give your name");
        name = in.nextLine();
        System.out.println("Please, write your city");
        city = in.nextLine();
        System.out.println("Please, write your age");
        age = in.nextInt();
        System.out.println("Please, write your hobby");
        hobby = in.next();
        int i;

        do {
            System.out.println("What tab do you want to see? Press 1,2,3(numb off tab) or 4(for exit)");
            i = in.nextInt();
            switch (i) {
                case 1:
                    tab1();
                    break;
                case 2:
                    tab2();
                    break;
                case 3:
                    tab3();
                    break;
            }
        }
        while (i != 4);


    }

    public static void tab1 () {
        System.out.printf("Name:%10s\nCity:%10s\nAge:%11d\nHobby:%9s.\n\n*********\n\n",name,city,age,hobby);
    }

    public static void tab2 () {
        System.out.printf("A man has name %s and lives in the %s city. " +
                "He is %d years old and he has hobby %s.\n\n*********\n\n",name,city,age,hobby);
    }

    public static void tab3 () {
        System.out.printf("%-10s-name\n%-10s-city\n%-10d-age\n%-10s-hobby.\n\n*********\n\n",name,city,age,hobby);
    }

}
