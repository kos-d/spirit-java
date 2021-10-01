package books.promdev.part_01_core.chapt04;

public class Course {
    public int id = 71;
    
    public Course() {
        System.out.println("constuctor class Course");
        id = getId();
        System.out.println(" id = " + id);
    }
    
    public int getId() {
        System.out.println("getId() class Course");
        return id;
    }
}