package module08.homework;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    
    private Object[] myArray;
    private int size;
    
    public MyArrayList() {
        myArray = new Object[10];
        size = 0;
    }
    
    public int getSize() {
        return size;
    }

    @Override
    public void add(T value) {
        if (size == myArray.length) {
            Object[] newArray = new Object[myArray.length * 2];
            System.arraycopy(myArray, 0, newArray, 0, myArray.length);
            myArray = newArray;
        }
        myArray[size++] = value;
    }

    @Override
    public void remove(int index) {
        Object[] newArray = new Object[myArray.length - 1];
        System.arraycopy(myArray, 0, newArray, 0, index);
        System.arraycopy(myArray, index + 1, newArray, index, myArray.length - 1 - index);
        myArray = newArray;
        size--;
    }

    @Override
    public void clear() {
        size = 0;
        myArray = new Object[10];
    }

    @Override
    public int size() {
        return getSize();
    }

    @Override
    public T get(int index) {
        return (T) myArray[index];
    }
    
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
