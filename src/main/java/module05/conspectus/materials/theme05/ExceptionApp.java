package module05.conspectus.materials.theme05;

public class ExceptionApp {
    public static void main(String[] args) {
        divide(1, 0);
        divide(1, 1);
    }
    private static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("No divide on zero");
        } finally {
            System.out.println("All time show");
        }
    }
}