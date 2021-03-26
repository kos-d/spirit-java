package module03.test.arrays;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        //           0  1  2  3  4
        int[] arr = {2, 1, 4, 5, 3};

        int[] arrayCopy = new int[5];

        arrayCopy(arr);
        System.out.println("arrayCopy " + Arrays.toString(arrayCopy));

    }
    public static int arrayCopy(int[] arr) {
        int[] arrayCopy = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arrayCopy[i] = arr[i];
            return arrayCopy[i];
        }
        return 0;
    }

}
