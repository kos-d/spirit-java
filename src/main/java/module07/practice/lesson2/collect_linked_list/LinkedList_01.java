package module07.practice.lesson2.collect_linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // implements List method add()
        list.add("a");
        list.add("b");
        list.add("c");
        
        String get0 = list.get(0);
        String get1 = list.get(1);
        String get2 = list.get(2);
        System.out.println("get(0) -> " + get0);
        System.out.println("get(1) -> " + get1);
        System.out.println("get(2) -> " + get2);
        
        int size = list.size();
        System.out.println("size -> " + size);
        
        // implements Deque method addLast()
        list.addLast("d");
        list.addFirst("a0");
        String toString = list.toString();
        System.out.println("toString() -> " + toString);
        
        String pop = list.pop();
        System.out.println("pop " + pop);
        //------------------------------
        list.clear();
        int size1 = list.size();
        System.out.println("size1 -> " + size1);
        
        list.addFirst("new a");
        boolean contains = list.contains("new a"); // true
        System.out.println("contains: " + contains);
        
        list.add("new b");
        list.add("new c");
        
        Iterator<String> iterator = list.iterator();
        
        System.out.println("iterator: " + iterator);
        
        Iterator<String> descendingIterator = list.descendingIterator();
        System.out.println("descendingIterator: " + descendingIterator);
        
        //implements Queue methods element() show from head
        String element = list.element();
        System.out.println("element: " + element);
        
        String peek = list.peek(); // how method element show from head
        System.out.println("peek " + peek);
        
        String poll = list.poll();  // how method element delete from head
        System.out.println("poll " + poll);
        
        String remove = list.remove();
        System.out.println("remove " + remove);
        
        String poll1 = list.poll();
        System.out.println("poll1 " + poll1);
        
        boolean offer = list.offer(peek);
        System.out.println("");
        
        //-------------------------------------
        
        String first = list.getFirst();
        System.out.println("getFirst() " + first);
        
        String last = list.getLast();
        System.out.println("getLast() " + last);
        
        int indexOf = list.indexOf(last);
        System.out.println("indexOf " + indexOf);
        
        
    }
}