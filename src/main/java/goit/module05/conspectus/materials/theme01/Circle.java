package goit.module05.conspectus.materials.theme01;

public class Circle extends Shape {
    private float radius;
    
    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
        
        System.out.println("Call in Circle");
    }
}