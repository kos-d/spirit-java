package books.promdev.part_01_core.chapt06_interface_inner_class.usermng;

public class UserStatistic extends books.promdev.part_01_core.chapt06_interface_inner_class.objects.CommonObject {
    private long id;
    private int mark;
    
    public UserStatistic() {
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
}