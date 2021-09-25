package books.promdev.chapt05_pattern._02_GoF._02_abstract_factory;

public abstract class BaseFactory {
    public abstract Circle createCircle(double radius);
    public abstract Triangle createTriangle(double a, double b);
}