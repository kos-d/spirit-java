package module03.test.arrays;

import java.util.Arrays;

public class ArrayCopyTest {

    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 3, 1};

        int[] arrCopy = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
            System.out.println("arrCopy[i] = " + arrCopy[i]);
        }
        arrayCopy(arr);

        System.out.println("" + Arrays.toString(arrCopy));
    }
    public static int arrayCopy (int[] arr) {

        int[] arrayCopy = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arrayCopy[i] = arr[i];
            return arrayCopy[i];
        }
        return 0;
    }
}
