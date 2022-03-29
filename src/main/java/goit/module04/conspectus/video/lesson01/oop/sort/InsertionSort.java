package goit.module04.conspectus.video.lesson01.oop.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, 88, 31, 154, 120, 100,};
        
        System.out.println(Arrays.toString(inputData));
        insertionSort(inputData, 1, inputData.length);
        
        System.out.println(Arrays.toString(inputData));
    }
    
    public static void insertionSort(int[] m, int a, int b) {  
        int i, j, t;
        for (i = a; i < b; i++) {
            t = m[i];
            for (j = i - 1; j >= a - 1 && m[j] > t; j--) m[j + 1] = m[j];
            m[j + 1] = t;
        }
    }
}