package module08.homework;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack<T> {
    
    static class MyNode<T> {
        private T element;
        private MyNode<T> next;
        
        MyNode(T element) {
            this.element = element;
        }
        
        public T getElement() {
            return element;
        }
        
        public void setElement(T element) {
            this.element = element;
        }
        
        public MyNode<T> getNext() {
            return next;
        }
        
        public void setNext(MyNode<T> next) {
            this.next = next;
        }
        
        @Override
        public String toString() {
            return element + ", " + next;
        }
    }
    
    private MyNode<T> currentElement = null;
    int size = 0;
    
    public MyStack() {
        
    }
    
    public void push(T element) {
        MyNode<T> myNewNode = new MyNode<>(element);
        myNewNode.setNext(currentElement);
        currentElement = myNewNode;
        size++;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return currentElement.getElement();
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        MyNode <T> myNode = currentElement.getNext();
        size--;
        return (T) myNode.getElement();
    }
    
    public int size() {
        return size;
    }
    
    public void clear() {
        currentElement = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        return "" + currentElement;
    }
    
//    @Override
//    public String toString() {
//        
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        sb.append(currentElement);
//        sb.append("]");
//        return sb.toString();
//    }
    
    public static void main(String[] args) {

        MyStack<Integer> stringMyStack = new MyStack<>();
        stringMyStack.push(1);
        stringMyStack.push(1);
        stringMyStack.push(1);
        stringMyStack.push(2);
        stringMyStack.push(3);
        stringMyStack.push(4);
        stringMyStack.push(5);
        stringMyStack.push(6);
        stringMyStack.push(7);
        stringMyStack.push(8);
        stringMyStack.push(9);
        stringMyStack.push(10);
        System.out.println(stringMyStack);
        System.out.println("-------------------------------------");
        System.out.println(stringMyStack.peek());
        System.out.println("-------------------------------------");
        System.out.println(stringMyStack.pop());
        System.out.println("-------------------------------------");
        System.out.println(stringMyStack);
        System.out.println(stringMyStack.size());
        System.out.println("-------------------------------------");
        stringMyStack.clear();
        System.out.println();
        
        Stack<Integer> newStack = new Stack<>();
        
        newStack.push(1);
        newStack.push(2);
        System.out.println(newStack);

    }
    
    
}