package books.guide.chapt07;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "painted over";
        
        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "contour";
        
        System.out.println("Information to t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());
        
        System.out.println();
        
        System.out.println("Information to t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
        
        System.out.println();
        
        TwoDShape shape = new TwoDShape();
        
        shape.width = 10;
        shape.height = 20;
        
        shape.showDim();
    }
}