package books.guide;

public class ForTest {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("For stop press 'S' ");
        int i;
        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("loop # " + i);
        }
    }
}