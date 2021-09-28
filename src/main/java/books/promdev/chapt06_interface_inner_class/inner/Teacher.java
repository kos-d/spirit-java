package books.promdev.chapt06_interface_inner_class.inner;

public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }
    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}