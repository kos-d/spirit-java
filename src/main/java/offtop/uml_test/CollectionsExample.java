package offtop.uml_test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Dictionary;
import java.util.EnumSet;
import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Vector;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionsExample {
    public static void main(String[] args) {
        
        Collection<String> collect = new ArrayList();
        collect.add("Hello");
        
        System.out.println(collect);
        
        List<String> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<String> linkedList = new LinkedList<>();
        
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
//        Set<String> enumSet = new EnumSet<>();
        
        
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Hashtable<String, Integer> hashTable = new Hashtable<>();
//        Map<String, Integer> hashTable = new Dictionary<>();
//        Map<String, Integer> hashTable = new WeakHashMap<>();
        
        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();
        
    }
}