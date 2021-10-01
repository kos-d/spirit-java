package books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge;

import books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.implementor.YellowColor;
import books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.abstraction.Rectangle;
import books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.abstraction.Circle;


public class Main {
    public static void main(String[] args) {
        YellowColor color = new YellowColor();
        new Rectangle(color).performWithColor();
        new Circle(color).performWithColor();
    }
}