package module06.practice.lesson2.test2;

import java.util.Arrays;

public class ArrayWrapper implements Iterable {
    
    private final String[] array;
    
    private int cursor = 0;

    public ArrayWrapper(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public boolean hasNext() {
        return cursor < array.length;
        //return !(cursor < array.length);
    }

    @Override
    public String next() {
        return array[cursor++];
    }
    
    @Override
    public void reset() {
        cursor = 0;
    }
}