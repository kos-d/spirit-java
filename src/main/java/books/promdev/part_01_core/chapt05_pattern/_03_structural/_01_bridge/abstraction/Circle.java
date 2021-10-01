package books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.abstraction;

import books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.implementor.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        setColor(color);
    }
    @Override
    public void performWithColor() {
        System.out.println("Performing in Circle Class");
        color.useBrush();
    }
}