package books.promdev.chapt03;

public class ShapeRunner {
    public static void main(String[] args) {
        double x = 2, y = 3;
        Shape[] arr = Shape.values();
        for (Shape sh : arr) {
            System.out.printf("%10s = %5.2f%n", sh, sh.square(x, y));
        }
    }
}