package books.promdev.chapt06_interface_inner_class.objects;

public class CommonObject implements Cloneable {
    public CommonObject() {
        super();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}