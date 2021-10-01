package books.promdev.part_01_core.chapt05_pattern._02_GoF._02_abstract_factory;

public class WhiteTriangle extends Triangle {
    public WhiteTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        color = "White";
    }
    public void square() {
        double s = 0.5 * a * b;
        System.out.println(color + " Triangle" + " Square = " + s);
    }
}