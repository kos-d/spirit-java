package books.promdev.part_01_core.chapt06_interface_inner_class;

public class Circle implements Shape {
    private double r;
    
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}