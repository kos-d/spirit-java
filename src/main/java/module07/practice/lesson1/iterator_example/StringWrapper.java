package module07.practice.lesson1.iterator_example;

public class StringWrapper implements Iterator {
    
    private final String value;
    
    private int cursor = 0;

    public StringWrapper(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getCursor() {
        return cursor;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean hasNext() {
        return cursor < value.toCharArray().length;
    }

    @Override
    public String next() {
        return String.valueOf(value.charAt(cursor++));
    }
}