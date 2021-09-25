package books.promdev.chapt05_pattern._02_GoF._02_abstract_factory;

public class WhiteCircle extends Circle {
    public WhiteCircle(double radius) {
        this.radius = radius;
        color = "White";
    }
    public void square() {
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println(color + " Circle " + " Square = " + s);
    }
}