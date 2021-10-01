package books.promdev.part_01_core.chapt03;

public class Quest {
    private int id;
    private String text;
    
    public Quest() {
        super();
    }
    
    public Quest(int idc, String txt) {
        super();
        id = idc;
        text = txt;
    }

    @Override
    public String toString() {
        return "Quest{" + "id=" + id + ", text=" + text + '}';
    }
    
    
    public static void main(String[] args) {
        Quest a = new Quest();
        Quest b = new Quest(71, "How many bits does boolean take?");
        
        System.out.println(b);
    }
}