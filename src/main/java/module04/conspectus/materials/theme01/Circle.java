package module04.conspectus.materials.theme01;

public class Circle extends Shape {
    private int radius;
    
    public void setRadius(int redius) {
        this.radius = redius;
    }
     @Override
    public float getArea() {
        return (float) (Math.PI * (float) radius * (float) radius);
    }
}