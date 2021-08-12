package offtop.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NewApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input array length:");
        
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        
        System.out.println("Input array elements:");
        
        for (int i = 0; i < arrLength; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("Inserted array elements:");
        for (int i = 0; i < arrLength; i++) {
            System.out.println("array "+ i +" " + arr[i]);
        }
        System.out.println();
        
        System.out.println(Arrays.toString(arr));
    }
}