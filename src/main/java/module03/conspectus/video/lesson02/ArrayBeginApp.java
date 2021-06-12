package module03.conspectus.video.lesson02;

import java.util.Arrays;

public class ArrayBeginApp {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
            System.out.print("\n");

        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }
        System.out.println(Arrays.toString(args));

        System.out.print("\n");
    
        int[] array = new int[3];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int[] myArray = Arrays.copyOf(array, 5);
        myArray[3] = 4;

        
       // System.out.println("Arrays.compare() " + Arrays.compare(array, myArray));

                
//        Arrays.copyOf();
//        Arrays.compare(array, myArray)    
        System.out.println(array.toString());
        System.out.println("array " + Arrays.toString(array));
        System.out.println("myArray " + Arrays.toString(myArray));
    }
}
/*
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.print("\n");

        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }

    }
} 
*/
