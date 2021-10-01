package books.promdev.part_01_core.chapt04;

public class BaseCourse extends Course {
    public int id = 90;
    
    public BaseCourse() {
        System.out.println("constructor class BaseCourse");
        System.out.println(" id = " + getId());
    }
    
    public int getId() {
        System.out.println("getId() class BaseCourse");
        return id;
    }
}