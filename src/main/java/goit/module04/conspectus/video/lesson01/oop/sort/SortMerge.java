package goit.module04.conspectus.video.lesson01.oop.sort;

import java.util.Arrays;

public class SortMerge {    
    public static void main(String[] args) {
        
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, 88, 31, 154, 120, 100,};        
        
        SortMerge sortMerge = new SortMerge();
        
        System.out.println(Arrays.toString(inputData));
        
        int[] result1 = sortMerge.sortMerge(inputData);
        System.out.println(Arrays.toString(result1));
        
        System.out.println(Arrays.toString(inputData));        
    }
    
    public int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                     sortMerge(Arrays.copyOfRange(arr, middle, len)));
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