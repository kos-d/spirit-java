package books.promdev.chapt06_interface_inner_class;

public class Rectangle implements Shape {
    private double a, b;
    
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSquare() {
        return a * b;
    }
    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}