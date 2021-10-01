package books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.abstraction;

import books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.implementor.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        setColor(color);
    }
    public void performWithColor() {
        System.out.println("Perform in Rectangle class");
        color.useBrush();
    }
}