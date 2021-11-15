package books.guide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecrFor {

    public static void main(String[] args) {
        int i;
        int[] arr = new int[50];
        for (i = 100; i > -100; i -= 5) {
            System.out.println(i);
        }
        int count;
        for (count = 10; count < 5; count++) {
            System.out.println("from for");
            i += count;
        }
        System.out.println("test");
    }
}
