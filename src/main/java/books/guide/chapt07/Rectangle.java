package books.guide.chapt07;

public class Rectangle extends TwoDShape {
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