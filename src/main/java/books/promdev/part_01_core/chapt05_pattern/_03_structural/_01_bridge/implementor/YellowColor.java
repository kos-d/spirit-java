package books.promdev.part_01_core.chapt05_pattern._03_structural._01_bridge.implementor;

public class YellowColor extends Color {
    @Override
    public void useBrush() {
        System.out.println("BrushColor - Yellow");
    }
}