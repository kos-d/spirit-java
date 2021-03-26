package books.headFirstJava.chap03.arrays;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {

        int[] arr = {7, 12, 5, 14, 2};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
