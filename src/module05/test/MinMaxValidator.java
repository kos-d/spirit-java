package module05.test;

public class MinMaxValidator {
    private int min;
    private int max;

    public MinMaxValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public MinMaxValidator(int min) {
        this(min, 100);
    }
    public MinMaxValidator() {
        this(0, 100);
    }
    public boolean isValid(int value) {
        return value >= min && value <= max;
    }
}

