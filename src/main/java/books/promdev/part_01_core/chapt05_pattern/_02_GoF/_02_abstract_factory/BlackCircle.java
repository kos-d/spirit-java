package books.promdev.part_01_core.chapt05_pattern._02_GoF._02_abstract_factory;

public class BlackCircle extends Circle {
    public BlackCircle(double radius) {
        this.radius = radius;
        color = "Black";
    }
    
    public void square() {
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println(color + " Circle" + " Square = " + s);
    }
}