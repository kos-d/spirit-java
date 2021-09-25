package books.promdev.chapt04.cloneExample;

public class Student implements Cloneable {
    private int id = 71;
    
    public int getId() {
        return id;
    }
    
    public void setId(int value) {
        id = value;
    }
    
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("impossible");
        }
    }
}