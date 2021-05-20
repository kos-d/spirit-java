package module07.homework;

public class ShapeRunner {
    public static void main(String[] args) {
        
        ShowNameShape showName = new ShowNameShape();
        
        Shape cone = new Cone("Cone");
        String displayCone = showName.displayShape(cone);     
        System.out.println(displayCone);
        
        Shape circle = new Circle("Circle");
        String displayCircle = showName.displayShape(circle);     
        System.out.println(displayCircle);
        
        Shape sphere = new Sphere("Sphere");
        String displaySphere = showName.displayShape(sphere);     
        System.out.println(displaySphere);
        
        Shape square = new Square("Square");
        String displaySquare = showName.displayShape(square);     
        System.out.println(displaySquare);
        
        Shape rectangle = new Rectangle("Rectangle");
        String displayRectangle = showName.displayShape(rectangle);     
        System.out.println(displayRectangle);
    }
}