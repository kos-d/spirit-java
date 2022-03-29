package goit.module04.conspectus.materials.theme01;

public class Quad extends Shape {
    protected int side;
    
    public void setSide(int side) {
        this.side = side;
    }
    
    @Override
    public float getArea() {
        return side * side;
    }
}