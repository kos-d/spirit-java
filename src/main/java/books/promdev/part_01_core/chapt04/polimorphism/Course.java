package books.promdev.part_01_core.chapt04.polimorphism;

public class Course {
    private int id;
    private String name;
    
    public Course(int i, String n) {
        id = i;
        name = n;
    }
    public String toString() {
        return "title: " + name + "(" + id + ")"; 
    }
}