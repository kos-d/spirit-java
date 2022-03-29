package goit.module03.test.arrays;
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        //allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at inex 0: " + anArray[0]);
        System.out.println("Element at inex 1: " + anArray[1]);
        System.out.println("Element at inex 2: " + anArray[2]);
        System.out.println("Element at inex 3: " + anArray[3]);
        System.out.println("Element at inex 4: " + anArray[4]);
        System.out.println("Element at inex 5: " + anArray[5]);
        System.out.println("Element at inex 6: " + anArray[6]);
        System.out.println("Element at inex 7: " + anArray[7]);
        System.out.println("Element at inex 8: " + anArray[8]);
        System.out.println("Element at inex 9: " + anArray[9]);

        int[] myArray;
        myArray = new int[10];
        System.out.println("myArray length = " + myArray.length);

        int[] arrayInt = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        System.out.println(Arrays.toString(arrayInt));

    }
}
