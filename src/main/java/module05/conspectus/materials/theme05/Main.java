package module05.conspectus.materials.theme05;

public class Main {
    public static void main(String[] args) throws IllegalZeroDivideException {
        divide(1, 0);
    }

    private static void divide(int a, int b) throws IllegalZeroDivideException {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new IllegalZeroDivideException();
        }
    }
}
