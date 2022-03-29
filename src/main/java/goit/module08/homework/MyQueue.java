package goit.module08.homework;

//package module08.homework;
//
//public class MyQueue<T> {
//    
//    private Object[] myQueueArray;
//    private int size;
//    
//    public MyQueue() {
//        myQueueArray = new Object[10];
//        size = 0;
//    }
//    
//    public int getSize() {
//        return size;
//    }
//    
//    public void add(T value) {
//        if (size == myQueueArray.length) {
//            Object[] newArray = new Object[myQueueArray.length * 2];
//            System.arraycopy(myQueueArray, 0, newArray, 0, myQueueArray.length);
//            myQueueArray = newArray;
//        }
//        myQueueArray[size++] = value;
//    }
//    
//    public void remove(int index) {
//        Object[] newArray = new Object[myQueueArray.length - 1];
//        System.arraycopy(myQueueArray, 0, newArray, 0, index);
//        System.arraycopy(myQueueArray, index + 1, newArray, index, myQueueArray.length - 1 - index);
//        myQueueArray = newArray;
//        size--;
//    }
//    
//    public void clear() {
//        size = 0;
//        myQueueArray = new Object[10];
//    }
//    
//    public int size() {
//        return getSize();
//    }
//    
//    public T peek() {
//        return (T) myQueueArray[0];
//    }
//    
//    public T poll() {
//        Object[] newArray = new Object[myQueueArray.length - 1];
//        T firstElement = (T) myQueueArray[0];
//        System.arraycopy(myQueueArray, 1, newArray, 0, myQueueArray.length - 1);
//        myQueueArray = newArray;
//        size--;
//        return firstElement;
//    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (int i = 0; i < size; i++) {
//            sb.append(myQueueArray[i]);
//            if (i < size - 1) {
//                sb.append(", ");
//            }
//        } 
//        sb.append("]");
//        return sb.toString();
//    }
//}