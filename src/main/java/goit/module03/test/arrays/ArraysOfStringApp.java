package goit.module03.test.arrays;

public class ArraysOfStringApp {
    public static void main(String[] args) {
        String[] myArray = new String[3];
        myArray[0] = "Hello";
        myArray[1] = "World";
        myArray[2] = "Java";

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("\n");

        for (String nameVariables : myArray) {
            System.out.println(nameVariables);
        }

        System.out.println("\n");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
