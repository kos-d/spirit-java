package goit.module08.conspectus.video.lesson03;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); 
        set.add("England");
        set.add("Ukraine");
        
        boolean isUkraineExist = set.contains("Ukraine");
        
        System.out.println("is Ukraine Exist? " + isUkraineExist);
        
        System.out.println(set);
        
        set.remove("England");
        System.out.println(set);
        
    }
}