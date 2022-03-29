package goit.module04.conspectus.video.lesson01.oop.sort;

import java.util.Arrays;

public class SortShell {
    public static void main(String[] args) {
        System.out.println("Sort Shell");
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, 88, 31, 154, 120, 100,};
        
        SortShell sortShell = new SortShell();
        
        int[] copyData = Arrays.copyOf(inputData, inputData.length);
        
        System.out.println(Arrays.toString(inputData));
        
        sortShell.sort_shell(copyData);
        
        System.out.println(Arrays.toString(copyData));
        
        System.out.println(Arrays.toString(inputData));
        
        
    }
    public void sort_shell(int[] array) {
        int i, j, k, h, m = 0, b = array.length;
        int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
               84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
               58548857, 157840433, 410151271, 1131376761, 2147483647 };
        while (d[m] < b) ++m;
        while (--m >= 0) {
            k = d[m];
            for (i =k; i < b; i++) {
                j = i;
                h = array[i];
                while ((j >= k) && (array[j - k] > h)) {
                    array[j] = array[j - k];
                    j -= k;
                }
                array[j] = h;
            }
        }
    }
}