package module08.homework;
 
import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T>, Iterable<T> {
    
    private int size;
    private MyNode<T> first;
    private MyNode<T> last;
    
    public MyLinkedList() {
        size = 0;
    }
    
    private static class MyNode<T> {
        T item;
        MyNode<T> next;
        MyNode<T> prev;
        
        MyNode(T item) {
            this.item = item;
        }
    }
    
    private MyNode<T> getMyNodeByIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        MyNode<T> result;
        if (size / 2 > index) {
            result = first;
            for (int i = 0; i < index; i++) {
                result = result.next;
            } 
        } else {
            result = last;
            for (int i = size - 1; i > index; i--) {
                result = result.prev;
            }
        }
        return result;
    }

    @Override
    public void add(T value) {
        MyNode<T> newNode = new MyNode<>(value);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        MyNode<T> myNode = getMyNodeByIndex(index);
        if (myNode.prev == null) {
            first = myNode.next;
        } else {
            myNode.prev.next = myNode.next;
        }
        if (myNode.next == null) {
            last = myNode.prev;
        } else {
            myNode.next.prev = myNode.prev;
            size--;
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return getMyNodeByIndex(index).item;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode<T> node = first;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                T item = node.item;
                node = node.next;
                return item;
            }
        };
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}