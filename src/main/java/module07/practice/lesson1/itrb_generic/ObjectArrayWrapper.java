package module07.practice.lesson1.itrb_generic;

import java.util.Arrays;

public class ObjectArrayWrapper implements Iterable {
    
private final Object[] array;
    
    private int cursor = 0;

    public ObjectArrayWrapper(Object[] array) {
        this.array = array;
    }

    public Object[] getArray() {
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
    public Object next() {
        return array[cursor++];
    }
    
//    @Override
//    public void reset() {
//        cursor = 0;
//    }
}