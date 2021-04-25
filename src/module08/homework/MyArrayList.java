package module08.homework;

//public class MyArrayList<T> implements MyList<T>{
//
//    @Override
//    public void add(Object value) {
//    }
//
//    @Override
//    public T remove(int index) {
//    }
//
//    @Override
//    public void clear() {
//    }
//
//    @Override
//    public int size() {
//    }
//
//    @Override
//    public T get(int index) {
//    }
//}
//private Object[] array;//10
//    
//    private int size;
//
//    private int cursor;
//    
////    public ArrayWrapper() {
////      this(10);
////    }
//    
//    public ArrayWrapper(int capacity) {
//        this.cursor = 0;
//        this.size = 0;        
//        this.array = new Object[capacity];
//    }
//    
//    public ArrayWrapper() {
//        this.cursor = 0;
//        this.size = 0;        
//        this.array = new Object[10];
//    }
//    
//    public ArrayWrapper(E[] array) {
//        this.cursor = 0;
//        this.size = 0;        
//        this.array = array;
//    }
//    /*
//    public ArrayWrapper(E[] array) {
//        this(10);
//        this.array = array;
//    }
//    */
//    //ArrayList methods
//    public void add(E e) {
//        if (size == array.length) {
//            Object [] newArray = new Object[array.length * 2];
//            System.arraycopy(array, 0, newArray, 0, array.length);
//            array = newArray;
//        }
//        array[size++] = e;
//    }
//    
//    public int size(int index) {
//        return size;
//    }
//    
//    public int length(int index) {
//        return array.length;
//    }
//    
//    
//    
//    public void set(int index, E element) {
//        array[index] = element;
//    }
//
//    public E get(int index) {
//        return (E) array[index];
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 61 * hash + Arrays.deepHashCode(this.array);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final ArrayWrapper<?> other = (ArrayWrapper<?>) obj;
//
//        if (!Arrays.deepEquals(this.array, other.array)) {
//            return false;
//        }
//        return true;
//    }
//    
//    @Override
//    public String toString() {
//        return Arrays.toString(array);
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); 
//    }
//    
//    @Override
//    public Iterator<E> iterator() {
//        return new Iterator<E>() {
//            @Override
//            public boolean hasNext() {
//                return cursor < array.length;
//            }
//            @Override
//            public E next() {
//                return (E) array[cursor++];
//            }
//        };
//    }
//
//import java.util.Arrays;
//import java.util.Iterator;
//import module07.practice.lesson2.custom_list.ArrayWrapper;

