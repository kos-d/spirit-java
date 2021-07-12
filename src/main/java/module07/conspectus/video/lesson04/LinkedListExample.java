package module07.conspectus.video.lesson04;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        // time complexity
        
        // получение элемента по индексу - O(n)
        
        // добавление элементa в конец - O(1)
        // добавление элементa в начало - O(1)
                
        // удаление элемента - O(1)
        // поиск элемента - O(n)
        
        Iterable<String> iterable = new LinkedList<>();
        
        Collection<String> collection = new LinkedList<>();
        
        Deque<String> deque = new LinkedList<>();
        deque.add("Hello");
        
        List<String> list = new LinkedList<>(deque);
        System.out.println(list);
        
        Queue<String> queue = new LinkedList<>();
    }
}