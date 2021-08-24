package module08.conspectus.video.lesson02;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapCustomKey {
    public static void main(String[] args) {
        TreeMap<Employee, String> treeMap = new TreeMap<>();
        
        Employee employee1 = new Employee(1, "Oleksandr");
        treeMap.put(employee1, "Ukraine");
        
        Employee employee2 = new Employee(5, "Andrew");
        treeMap.put(employee2, "Ukraine");
        
        Employee employee3 = new Employee(3, "Iban");
        treeMap.put(employee3, "Ukraine");
        
        System.out.println(treeMap);
        
        SortedMap<Employee, String> headMap = treeMap.headMap(employee3);
        
        System.out.println("Head map " + headMap);
        
        SortedMap<Employee, String> tailMap = treeMap.tailMap(employee3);
        System.out.println("Tail map " + tailMap);
//        try {
//            treeMap.put(employee1, "Ukraine");
//        } catch (ClassCastException ex) {
//            ex.printStackTrace();
//        }
        
    }
}