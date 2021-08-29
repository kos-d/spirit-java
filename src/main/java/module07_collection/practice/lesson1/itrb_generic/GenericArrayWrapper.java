package module07_collection.practice.lesson1.itrb_generic;

import java.util.Arrays;

public class GenericArrayWrapper<E> implements Iterable<E> {
    
    private final E [] array;
    
    private int cursor = 0;

    public GenericArrayWrapper(E [] array) {
        this.array = array;
    }
    
    public <T> T example(T t) {
        return t;
    }

    public E [] getArray() {
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
    public E next() {
        return array[cursor++];
    }
}