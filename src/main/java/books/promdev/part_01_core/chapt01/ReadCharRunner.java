package books.promdev.part_01_core.chapt01;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        System.out.println("Input value!");
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("symbol code: " + c + " = " + x);
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
    }
}