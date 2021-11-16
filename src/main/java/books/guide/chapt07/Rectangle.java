package books.guide.chapt07;

public class Rectangle extends TwoDShape {
    Rectangle(double w, double h) {
        super(w, h);
    }
//    boolean isSquare() {
//        if (width == height) return true;
//        return false;
//    }
//    
//    double area() {
//        return width * height;
//    }
    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth() * getHeight();
    }
}