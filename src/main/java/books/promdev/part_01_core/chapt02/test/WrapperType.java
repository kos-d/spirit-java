package books.promdev.part_01_core.chapt02.test;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class WrapperType {
    public static void main(String[] args) {
        String string;
        boolean boolean1;
        char char1;
        
        byte byte1;
        short short1;
        int int1 = 10;
        long long1;
        float float1F;
        double double1 = 1.98;
        
        Object ob;
        Boolean boolean2 = true;
        Character char2;        
        
        Byte byte2;
        Short short2;        
        Integer integer1 = -5;
        Long lpln2L;
        Float float2F;
        Double double2;
        
        double absDouble = abs(double1);
        int absInt = abs(int1);
        
        int abs = abs(integer1);
        System.out.println("module " + integer1 + " = " + abs);
        
        System.out.println(absDouble);
        System.out.println(absInt);
//        Map<EnumKey, V> enumMap = Collections.synchronizedMap(new EnumMap<EnumKey, V>()) ;
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        List<String> names = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        Queue<String> linkedList1 = new LinkedList<>();
        Deque<String> linkedList2 = new LinkedList<>();

    }
}