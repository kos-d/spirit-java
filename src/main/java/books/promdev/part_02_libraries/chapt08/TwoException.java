package books.promdev.part_02_libraries.chapt08;

public class TwoException {
    public static void main(String[] args) {
        try {
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = { 1 / a };
            c[a] = 71;
        } catch (ArithmeticException e) {
            System.err.println("divide on 0 " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("array index out of bound: " + e);
        }
        System.out.println("after block try-catch");        
    }
}
