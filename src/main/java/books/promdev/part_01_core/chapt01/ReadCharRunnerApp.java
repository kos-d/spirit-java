package books.promdev.part_01_core.chapt01;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadCharRunnerApp {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        
        try {
            System.out.println("Input Your name and press <Enter>:");
            String name = bis.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.print("error input " + e);
        }
    }
}