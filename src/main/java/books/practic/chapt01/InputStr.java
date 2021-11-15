package books.practic.chapt01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStr {

    public static void main(String[] args) {
        InputStreamReader is
                = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        try {
            System.out.println("Input your name and press <Enter>:");
            String name = bis.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.print("error input " + e);
        }
    }
}
