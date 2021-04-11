package module07.homework;

public class ShapeRunner {
    public static void main(String[] args) {
        
        Shape cone = new Cone();
        cone.display();
        
        Shape sphere = new Sphere();
        sphere.display();
        
        Shape circle = new Circle();        
        circle.display();
        
        Shape quad = new Square();
        quad.display();    
        
        Shape rectangle = new Rectangle();
        rectangle.display();
        
    }
}