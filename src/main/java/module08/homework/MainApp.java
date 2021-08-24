//package module08.homework;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class MainApp {
//    public static void main(String[] args) {
//        
////        List<String> list = new ArrayList<>();
////        list.add("a");
////        list.add("a");
////        list.add("a");
////        System.out.println(list);
//        
////        System.out.println(list.size());
//        System.out.println("MyArrayList:");
//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        
//        myArrayList.add("a");
//        myArrayList.add("b");
//        myArrayList.add("c");
//        myArrayList.add("d");
//        myArrayList.add("e");
//        
//        System.out.println(myArrayList.toString());
//        System.out.println("size = " + myArrayList.size());
//        myArrayList.remove(2);
//        
//        System.out.println(myArrayList.toString());
//        System.out.println("size = " + myArrayList.size());
//        
//        String get = myArrayList.get(2);
//        System.out.println("get index[2] -> " + get);
//        myArrayList.clear();
//        System.out.println(myArrayList.toString());
//        
////        String[] arr = new String[] {"a", "b", "c" };
////        
////        System.out.println(Arrays.toString(arr));
//
//        List<String> myLinkedList1 = new LinkedList<>();
//        myLinkedList1.add("c");
//        myLinkedList1.add("c");
//        myLinkedList1.add("c");
//        
//        System.out.println(myLinkedList1);
//        
//        
//        System.out.println("MyLinkedList:");
//        MyList<Integer> myLinkedList = new MyLinkedList<>();
//        myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        myLinkedList.add(4);
//        myLinkedList.add(5);
//        
//        System.out.println(myLinkedList.toString());
//        
//        Integer get1 = myLinkedList.get(3);        
//        System.out.println("get index[3] -> " + get1);
//        
//        int size = myLinkedList.size();
//        System.out.println("size = " + size);
//        
//        myLinkedList.remove(0);
//        System.out.println(myLinkedList.toString());
//        int size1 = myLinkedList.size();
//        System.out.println("size1 = " + size1);
//        
//        System.out.println("______________________");
//        
////        Queue<String> myQueue = new Queue<>();
//
//        MyQueue<String> myQueue = new MyQueue<>();
//        
//        myQueue.add("a");
//        myQueue.add("b");
//        myQueue.add("c");
//        myQueue.add("d");
//        myQueue.add("e");
//        
//        int size2 = myQueue.size();
//        
//        System.out.println(myQueue.toString());        
//        System.out.println("size2 -> " + size2);
//        
//        myQueue.remove(2);
//        
//        System.out.println(myQueue.toString());
//        
//        String peek = myQueue.peek();
//        System.out.println("peek = " + peek);
//        
//        String poll = myQueue.poll();
//        System.out.println("poll = " + poll);
//        
//        System.out.println(myQueue.toString());
//        
//        String poll1 = myQueue.poll();
//        System.out.println("poll1 = " + poll1);
//        
//        System.out.println(myQueue.toString());
//        
//        System.out.println("______________________");
//        
//        MyStack<Integer> myStack = new MyStack<>();
//        myStack.push(1);
////        myStack.push("a");
////        myStack.push("b");
////        myStack.push("c");
////        myStack.push("d");
////        myStack.push("e");
//        
//        //System.out.println(Arrays.toString(myStack.myStackArray));
//        System.out.println(myStack.toString());
//    }
//}