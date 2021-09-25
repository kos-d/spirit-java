package books.promdev.chapt04.polimorphism;

public class BaseCourse extends Course {
    private int idTeacher;
    
    public BaseCourse(int i, String n, int it) {
        super(i, n);
        idTeacher = it;
    }
    
    public String toString() {
        return super.toString() + " teacher(" + idTeacher + ")";
    }
}