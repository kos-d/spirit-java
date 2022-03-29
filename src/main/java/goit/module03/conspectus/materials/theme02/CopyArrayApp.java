package goit.module03.conspectus.materials.theme02;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class CopyArrayApp {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 4, 1, 5};
        
        int[] numbersCopy = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];        
            System.out.println(numbersCopy[i]); 
        }
    }
}
/*
        int[] nums = {3, 2, 4, 5, 1 };

        System.out.println("nums.length = " + nums.length);
        System.out.println("nams[0] = " + nums[0]);
        
        for (int i = 0; i < nums.length; i++) {
            
        System.out.println("nums[i] = " + nums[i]);
        }

        for (int i = nums.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }        
        System.out.println(nums[i]);
        }


        i

    }
}

*/










/*        
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Input value array: ");
        n = in.nextInt();
        arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
        
        }
        for (int i : arr) {
            System.out.println(i + " " );
        }
        in.close();
/*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " );
        }

    }
}
       /* 
        int[] arr = new int[3];
        arr.

        public static int getRandomInt() {
            Random random = new Random();
            int randomInt = random.nextInt();
            return randomInt();
        }
        
    }
}
*/



        /*
        int[] arr = new int[3];
        System.out.println("arr.length = " + arr.length);
        int [] arrNova = new int[5];
        System.out.println("arrNova.length = " + arrNova.length);
        String[] arrString = {"one", "two", "tree"};
        System.out.println("arrString = " + arrString.length);
        System.out.println("" + arrString.toString());
        */

        /*
        int[] arr = new int[3];
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 4;
        }

        System.out.println("arr[0] = " + arr[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3;
        }
    
        System.out.println("arr[0] = " + arr[0]);
        */

/*
public class ArraysApp {
    public static void main(String[] args) {
    
        byte[] byteArray = new byte[4];
        System.out.println("byteArray.length = " + byteArray.length);

        short[] shortArray = new short[7];
        System.out.println("shortArray.length = " + shortArray.length);

        int[] intArray = new int[3];
        System.out.println("intArray.length = " + intArray.length);

        long[] longArray = new long[8];
        System.out.println("longArray.length = " + longArray.length);

        float[] floatArray = new float[2];
        System.out.println("floatArray.length = " + floatArray.length);

        double[] doubleArray = new double[9];
        System.out.println("doubleArray.length = " + doubleArray.length);

        char[] charArray = new char[6];
        System.out.println("charArray.length = " + charArray.length);

        String[] stringArray = new String[5];
        System.out.println("stringArray.length = " + stringArray.length);

        boolean[] booleanArray = new boolean[11];
        System.out.println("booleanArray.length = " + booleanArray.length);
        
        Person bob = new Person();
        System.out.println(bob.toString());

        Person[] personArray = new Person[2];
        System.out.println("personArray.length  = " + personArray.length);
        personArray[0] = bob;
        System.out.println("personArray[0] = " + personArray[0]);
    }
}

class Person {
    String name = "Bob";
    int age = 20;

    public String toString() {
        return "Person { name " + name + " age " + age + " }";
    }
}

*/
