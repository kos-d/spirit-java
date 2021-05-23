package module08.practice.lesson2;

public class Pair<K, V> {   // Entry
    private K key;
    private V value;
}

class Node<T> {
    private Node<T> prev;
    private T value;
    private Node<T> next;
}