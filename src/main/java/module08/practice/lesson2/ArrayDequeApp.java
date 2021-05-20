package module08.practice.lesson2;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeApp {
    public static void main(String[] args) {
        
        ArrayDeque<String> states = new ArrayDeque<>();
        
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        priorityQueue.add(5);
        priorityQueue.add(9);
        priorityQueue.add(3);
        //priorityQueue.add(2);

        System.out.println(priorityQueue);
    }
}