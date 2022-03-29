package goit.module08.conspectus.video.lesson01;

import java.util.Map;
import java.util.HashMap;

public class HashMapWithCustomKey {
    public static void main(String[] args) {
        Map<Employee, String> employees = new HashMap<>();
        
        Employee employee1 = new Employee(1, "Oleksandr");
//        employee1.setId(1);
//        employee1.setName("Oleksandr");
        
        employees.put(employee1, "Ukraine");
        
//        Employee employee2 = new Employee();
//        employee2.setId(1);
//        employee2.setName("Oleksandr");
//        
//        employees.put(employee2, "London");
        
        System.out.println(employees);
        
//        employee1.setName("Ivan");
        
        String ivan = employees.get(employee1);
//        String oleksandr = employees.get("Oleksandr");
        System.out.println("Ivan " + ivan);
//        System.out.println("Oleksandr " + oleksandr);
        
        System.out.println(employees);
        
    }
}