package goit.module03.conspectus.video.lesson02;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}