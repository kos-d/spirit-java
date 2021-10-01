package books.promdev.part_01_core.chapt04;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
//        if (obj instanceof Student) { // warning
        if (getClass() == obj.getClass()) {
            Student temp = (Student) obj;
            return this.id == temp.id &&
                    name.equals(temp.name) &&
                    this.age == temp.age;
        } else 
            return false;
    }
    //    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 31 * hash + this.id;
//        hash = 31 * hash + Objects.hashCode(this.name);
//        hash = 31 * hash + this.age;
//        return hash;
//    }
    
    @Override
    public int hashCode() {
        return (int) (31 * id + age + ((name ==null) ? 0 : name.hashCode()));
    }
    @Override
    public String toString() {
        return getClass().getName() + "@name " + name + " id: " + id + " age: " + age;
    }
}