package books.promdev.part_02_libraries.chapt09.test;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        
        try {
            isr = new InputStreamReader(System.in);
            System.out.println("Enter symbols, symbol 'q' for exit.");
            char a;
            do {
                a = (char) isr.read();
                System.out.print(a);
            } while (a != 'q');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                    System.out.println("InputStreamReader close");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
