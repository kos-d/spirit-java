package books.promdev.chapt03;

public abstract class AbstractCourse {
    private String name;
    public AbstractCourse() {   }
    public abstract void changeTeacher(int id);

    public void setName(String name) {
        this.name = name;
    }
}