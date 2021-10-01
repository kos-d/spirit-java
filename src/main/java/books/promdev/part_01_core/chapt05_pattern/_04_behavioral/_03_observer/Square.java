package books.promdev.part_01_core.chapt05_pattern._04_behavioral._03_observer;

public class Square extends OperationObserver {
    private float square;
    @Override
    public float valueChanged(Rectangle observed) {
        return square = observed.getWidth() * observed.getHeight();
    }
    @Override
    public String toString() {
        return "S = " + square;
    }
}