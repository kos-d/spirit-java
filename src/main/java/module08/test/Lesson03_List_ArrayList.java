package module08.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson03_List_ArrayList {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        for (String element : list) {
            System.out.println(element);
        }
        list.add(1, "Fifth");
        System.out.println("----------");
        for (String element : list) {
            System.out.println(element);
        }
        Collections.sort(list);
        System.out.println("==========");
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println("**********");
        List<String> subList = list.subList(1, 3);
        for (String el : subList) {
            System.out.println(el);
        }
    }
}