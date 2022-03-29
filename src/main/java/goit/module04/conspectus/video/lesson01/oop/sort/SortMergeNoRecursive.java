package goit.module04.conspectus.video.lesson01.oop.sort;

import java.util.Arrays;

public class SortMergeNoRecursive {
    public static void main(String[] args) {
        
        System.out.println("SortMergeNoRecursive");
        
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, 88, 31, 154, 120, 100,};
        
        SortMergeNoRecursive sortMergeNoRecursive = new SortMergeNoRecursive();
        
        System.out.println(Arrays.toString(inputData));
        
        int[] buff = Arrays.copyOf(inputData, inputData.length);
        
        sortMergeNoRecursive.sortMergeNoRecursive(buff);
        
        System.out.println(Arrays.toString(buff));
        
        System.out.println(Arrays.toString(inputData));
    }
    
    public void sortMergeNoRecursive(int[] arr) {
        int len = arr.length;
        int n = 1; 
        int shift; 
        int two_size; 
        int[] arr2;
        while (n < len) {
                shift = 0;
                while (shift < len) {
                        if (shift + n >= len) break;
                        two_size = (shift + n * 2 > len) ? (len - (shift + n)) : n;
                        arr2 = merge(Arrays.copyOfRange(arr, shift, shift + n),
                                     Arrays.copyOfRange(arr, shift + n, shift + n + two_size));
                        for (int i = 0; i < n + two_size; ++i)
                        arr[shift + i] = arr2[i]; 
                        shift += n * 2;
                }
                n *= 2;
        }
    }
    
    public int[] merge(int[] arr_1, int[] arr_2) {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; 
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
                if (b < len_2 && a < len_1) {
                        if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                        else result[i] = arr_1[a++];
                } else if (b < len_2) {
                        result[i] = arr_2[b++];
                } else {
                        result[i] = arr_1[a++];
                }
        }
        return result;
    }
}