package books.promdev.part_01_core.chapt05_pattern._02_GoF._02_abstract_factory;

public class BlackFactory extends BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
    }
    @Override
    public Triangle createTriangle(double a, double b) {
        return new BlackTriangle(a, b);
    }
}