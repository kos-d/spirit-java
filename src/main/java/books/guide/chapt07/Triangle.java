package books.guide.chapt07;

public class Triangle extends TwoDShape {
    String style;
    
    // constructor
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }
    
    double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}