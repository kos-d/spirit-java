package module03.conspectus.video.lesson05;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[] {0, -1, -2, -5, 10, 12, 5, 78, 45};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}