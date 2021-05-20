package module03.practice.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //empty array
        int[] arr = new int [0];
        
        int[] array = new int [3];        
        array[0] = 2;
        array[1] = 8;
        array[2] = 4;        
        System.out.println("array = " + Arrays.toString(array));
        
        int[] array2 = {2, 8, 4, 58};
        System.out.println("array = " + Arrays.toString(array));
        
        main1(array);
        main2(array);
        
        main1(1, 3, 5, 7);
        
        String[] arrString = new String[5];
        Main[] arrMain = new Main[5];
        
        int arrayLength = array.length;
        System.out.println("array.length = " + arrayLength);
        
        int a = array[1];
        System.out.println("a = " + a);
        
    }
    
    public static void main1(int ... args) {
        
    }
    public static void main2(int[] args) {
        
    }
}