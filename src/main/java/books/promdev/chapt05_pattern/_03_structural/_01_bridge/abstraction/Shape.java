package books.promdev.chapt05_pattern._03_structural._01_bridge.abstraction;

import books.promdev.chapt05_pattern._03_structural._01_bridge.implementor.Color;

public abstract class Shape {
    protected Color color;
    
    public Shape() {
        color = null;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void performWithColor();
}