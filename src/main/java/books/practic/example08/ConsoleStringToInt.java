package books.practic.example08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleStringToInt {
    public static void main(String[] args) {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] masStr = new String[3];
        int[] masInt = new int[3];
        try {
            System.out.println("Enter three number,");
            System.out.println("after number press Enter ->");
            for (int i = 0; i < 3; i++) {
                masStr[i] = br.readLine();
                masInt[i] = Integer.valueOf(masStr[i]).intValue();
            }
            System.out.print("array: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(masInt[i] + "; ");
            }
        } catch (IOException e) {
            System.out.print("error input: " + e);
        } catch (NumberFormatException e) {
            System.out.print("wrong format number: " + e);
        }
    }
}