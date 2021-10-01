package books.promdev.part_01_core.chapt06_interface_inner_class;

public abstract class Triangle implements Shape {
    private double a, b, c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}