package books.guide.chapt07;

public class Triangle extends TwoDShape {
    private String style;
    
    Triangle() {
        super();
        style = "none";
    }
    
    // constructor
    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    
    Triangle(double x) {
        super(x);
        style = "painted over";
    }
    
    double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}