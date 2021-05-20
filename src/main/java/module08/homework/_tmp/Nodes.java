package module08.homework._tmp;

public class Nodes {
    
    private Nodes() {
        
    }
    
    public static <T> Node<T> create(T element) {
        return new Node<>(element);
    }
    
    public static <T> void link(Node<T> first, Node<T> second) {
        first.next = second;
    }
    
    public static <T> Node<T> pairOf(T firstElement, T secondElement) {
        Node<T> firstNode = new Node<>(firstElement);
        Node<T> secondNode = new Node<>(secondElement);
        firstNode.next = secondNode;
        return firstNode;
    }
}