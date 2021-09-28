package books.promdev.chapt06_interface_inner_class;

public class Runner {
    public static void printFeatures(Shape f) {
        System.out.printf("square: %.2f perimeter: %.2f%n", f.getSquare(), f.getPerimeter());
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 9.95);
        Circle c = new Circle(7.01);
        printFeatures(r);
        printFeatures(c);
    }
}