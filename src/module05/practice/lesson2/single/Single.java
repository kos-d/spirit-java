package module05.practice.lesson2.single;

public class Single {
    
    private String name;
    
    private final static Single single;
    
    static {
        single = new Single();
        single.name = "";
    }
    
    private Single() {}
    
    public static Single create() {
            return single;
    }
}