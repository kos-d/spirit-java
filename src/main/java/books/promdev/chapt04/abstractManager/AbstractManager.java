package books.promdev.chapt04.abstractManager;

public abstract class AbstractManager {
    // field
    private int id;
    // constructor
    public AbstractManager(int id) {
        this.id = id;
    }
    // abstract method
    public abstract void assignGroupToCourse(int groupId, String nameCourse);
}