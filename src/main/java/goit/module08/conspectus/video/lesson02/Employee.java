package goit.module08.conspectus.video.lesson02;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
//    private int id;
//    private String name;
    
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj) {
            return false;
        }
        Employee employee = (Employee) obj;
        
        //return this.id == employee.id && this.name == employee.name;
        return this.id == employee.id && Objects.equals(this.name, employee.name);
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        }
        return 0;
    }
}