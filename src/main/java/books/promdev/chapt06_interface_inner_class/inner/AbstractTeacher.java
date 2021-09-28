package books.promdev.chapt06_interface_inner_class.inner;

public abstract class AbstractTeacher {
    private int id;
    public AbstractTeacher(int id) {
        this.id = id;
    }
    public abstract boolean excludeStudent(String name);
}