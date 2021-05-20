package library.arrays;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        
        int[] array = {2, 4, 5, 3, 1 };
        System.out.println("Array: = " + Arrays.toString(array));
        
        // method sort
        Arrays.sort(array);
        
        System.out.println("Array sort = " + Arrays.toString(array));
        
        
    }
}