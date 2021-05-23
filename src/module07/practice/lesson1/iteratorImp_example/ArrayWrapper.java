package module07.practice.lesson1.iteratorImp_example;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayWrapper<E> implements Iterable<E>, 
        Serializable, Cloneable {

    private final E[] array;

    private int cursor = 0;

    public ArrayWrapper(E[] array) {
        this.array = array;
    }

//    public E[] getArray() {
//        return array;
//    }
    public int length(int index) {
        return array.length;
    }
    
    public void set(int index, E element) {
        array[index] = element;
    }
    
    public E get(int index) {
        return array[index];
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Arrays.deepHashCode(this.array);        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArrayWrapper<?> other = (ArrayWrapper<?>) obj;
        
        if (!Arrays.deepEquals(this.array, other.array)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            
            @Override
            public boolean hasNext() {
                return cursor < array.length;
            }

            @Override
            public E next() {
                return array[cursor++];
            }
        };
    }
}