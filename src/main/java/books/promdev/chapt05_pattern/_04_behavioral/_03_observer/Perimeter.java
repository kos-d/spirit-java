package books.promdev.chapt05_pattern._04_behavioral._03_observer;

public class Perimeter extends OperationObserver {
    private float perimeter;
    @Override
    public float valueChanged(Rectangle observed) {
        return perimeter = 2 * (observed.getWidth() + observed.getHeight());
    }
    @Override
    public String toString() {
        return "P = " + perimeter;
    }
}