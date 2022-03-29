package goit.module04.conspectus.video.lesson01.oop;

import goit.module04.conspectus.video.lesson01.oop.sort.SortMerge;
import java.util.Arrays;

public class OOPStyle {
    public static void main(String[] args) {
        
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, 88, 31, 100, 120, 154};
        
        SortUtil sort = new SortUtil();
        SearchUtil search = new SearchUtil();
        
        SortMerge sortMerge = new SortMerge();
        
        int[] sortedArray = sort.sortIntArray(inputData);
        System.out.println(Arrays.toString(sortedArray));
        
        int result = search.findElement(sortedArray, 120);
        System.out.println(result);
        
        int[] result2 = sortMerge.sortMerge(inputData);
        System.out.println(Arrays.toString(result2));
    }
}