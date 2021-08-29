package module08.practice.lesson2;

public class MyArrayList<T> {
    
    public static void main(String[] args) {
        
    }
    
//    T[] array = (T[]) new Object[10];
    
    private Object[] array;    
    private int size;
    
    public MyArrayList() {
        array = new Object[10];
        size = 0;
    }
    
    private T get(int index) {
        return (T)array[index];
    }
    
    
}