package goit.module03.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class RandomTest {
    
    public static void main(String[] args) {
   }
}

/*
        
        int seed = 10;
        Random rnd = new Random();
        rnd.setSeed(seed);
        System.out.println(rnd);
        System.out.print("\n");

        int myInt = nextInt();

        int myIntCopy = myInt;

        System.out.println("myInt " + myInt);
        System.out.println("myIntCopy " + myIntCopy);


        int[] myIntArr = new int[5];
        myIntArr[0] = myInt;
        System.out.println("myIntArr[0] after = " + myIntArr);

        for (int i = 0; i < myIntArr.length; i++) {
            System.out.println("" + myIntArr[0]);
        }

        System.out.println("myIntArr[0] befor = " + Arrays.toString(myIntArr));
        
        
        
        boolean myBoolean = nextBoolean();
        System.out.println("" + myBoolean);

        int rndInt = nextInt();
        System.out.println(rndInt);


    }

    public static boolean nextBoolean() {
        Random rnd = new Random();
        return rnd.nextBoolean();
    
    }
    public static int nextInt() {
        Random rnd = new Random();

        return rnd.nextInt(20);
    }

//    Scanner scanner = new Scanner(System.in);


}


    public void scannerInputOutput() {

//    String name;
//    String city;
//    int age;
//    String hobby = "test";

    System.out.print("Input your name: ");
    String name = scanner.nextLine();
    System.out.print("Input your city: ");
    String city = scanner.nextLine();
    System.out.print("Input your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Input your hobby: ");
    String hobby = scanner.nextLine();
    
    System.out.printf("Name: %s \nCity: %s \nAge: %d \nHobby: %s \n", name, city, age, hobby);

    scanner.close();
    }
    public static void main(String[] args) {
        //new ScannerInputOutputApp().scannerInputOutput();
        ScannerInputOutputApp scannerInputOutputApp = new ScannerInputOutputApp();
        scannerInputOutputApp.scannerInputOutput();
    }
}
*/
