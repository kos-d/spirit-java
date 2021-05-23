package module08.homework;

import java.util.Iterator;

public class MyHashMap<K, V> implements Iterable<V> {
    private int size;
    private V head;
    private Pair<K, V> last;
    
    public MyHashMap() {
        size = 0;
    }
    
    private static class Pair<K, V> {
        private V value;
        private K key;
        Pair<K, V> next;
        
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;            
        }
    }
    
    public void put(K key, V value) {
        Pair<K, V> newPair = new Pair<>(key, value);
        if (head == null) {
            head = value;
        } else {
            last.next = newPair;
            newPair.next = last;
        }
        last = newPair;
        size++;
    }
    
    public void remove(K key) {
        Pair<K, V> newPair = new Pair<>(key, null);
        if (newPair.key == key) {
            last.next = last;
        }
        size--;
    }
    public void clear() {
        head = null;
        last = null;
        size = 0;
    }
    
    public int size() {
        return size;
    }
    
    public V get(K key) {
        Iterator <V> keyIterator = this.iterator();
        while (keyIterator.hasNext()) {
            if (keyIterator.next() == key) {
                return keyIterator.next();
            }
        }
        return null;
    }
    
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            private Pair<K, V> pair = last;
            
            @Override
            public boolean hasNext() {
                return pair != null;
            }
            
            @Override
            public V next() {
                V item = pair.value;
                pair = pair.next;
                return item;
            }
        };
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<V> iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
       
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(0, "carrot-0");
        myHashMap.put(1, "carrot-1");
        myHashMap.put(2, "carrot-2");
        myHashMap.put(3, "carrot-3");
        myHashMap.put(4, "carrot-4");

        System.out.println(myHashMap.get(2));
        //System.out.println(myHashMap.size());
        //myHashMap.remove(2);
        // myHashMap.clear();
        //System.out.println(myHashMap);
    }
}