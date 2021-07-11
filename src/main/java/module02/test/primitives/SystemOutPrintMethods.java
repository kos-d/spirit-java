package module02.test.primitives;

import java.lang.System;
import java.lang.String;
import java.lang.Object;

public class SystemOutPrintMethods {


    public static void main(String[] args) {
        //method println
        System.out.println("Hello world!");
        System.out.println("Hello java");
        int x = 5;
        int y = 6;
        System.out.println("x = " + x + "; y = " + y);
        //method print
        System.out.print("Hello print \n");
        //method printf
        System.out.printf("x = %d; y = %d \n", x, y);
        /*
            %x: для вывода шестнадцатеричных чисел
            %f: для вывода чисел с плавающей точкой
            %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
            %c: для вывода одиночного символа
            %s: для вывода строковых значений
         */

        System.out.printf("\n");

        Human tom = new Human();
        System.out.println(tom.toString());
        Human bill = new Human("Bill", 32, 1.8);
        System.out.println(bill.toString());



    }

}
class Human extends Object {
    private String name = "Tom";
    private  int age = 30;
    private double height = 1.70;

    public Human() {};

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
/*
    public void setName(String name) {
        this.name = name;
    }
*/
    /*public String getName() {
        return name;
    }*/
    @Override
    public String toString() {
        return "name = " + name + "\n"
                + "age = " + age + "\n"
                + "height = " + height + "\n";
    }
}

