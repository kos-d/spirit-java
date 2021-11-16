package books.guide.chapt07;

public class Triangle extends TwoDShape {
    String style;
    
    double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}