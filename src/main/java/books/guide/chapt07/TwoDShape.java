package books.guide.chapt07;

public class TwoDShape {
    private double width;
    private double height;
    
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    
    void showDim() {
        System.out.println("Width and height " +
                            width + " and " + height);
    }
}