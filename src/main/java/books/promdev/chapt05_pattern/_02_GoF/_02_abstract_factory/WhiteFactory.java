package books.promdev.chapt05_pattern._02_GoF._02_abstract_factory;

public class WhiteFactory extends BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new WhiteCircle(radius);
    }
    
    @Override
    public Triangle createTriangle(double a, double b) {
        return new WhiteTriangle(a, b);
    }
}