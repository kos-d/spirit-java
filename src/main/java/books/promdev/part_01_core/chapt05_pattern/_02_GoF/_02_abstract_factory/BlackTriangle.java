package books.promdev.part_01_core.chapt05_pattern._02_GoF._02_abstract_factory;

public class BlackTriangle extends Triangle {
    public BlackTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        color = "Black";
    }
    public void square() {
        double s = a * b / 2;
        System.out.println(color + " Triangle" + " Square = " + s);
    }
}