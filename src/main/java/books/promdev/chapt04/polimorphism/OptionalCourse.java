package books.promdev.chapt04.polimorphism;

public class OptionalCourse extends BaseCourse {
    private boolean required;
    
    public OptionalCourse(int i, String n, int it, boolean r) {
        super(i, n, it);
        required = r;
    }
    public String toString() {
        return super.toString() + " required -> " + required;
    }
}