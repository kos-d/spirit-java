package module05.practice.lesson2.prototype;

public class SinglePrototype implements Cloneable{
    
    private String name;
    
    private final static SinglePrototype single;
    
    static {
        single = new SinglePrototype();
        single.name = "";
    }
    
    private SinglePrototype() {}
    
    public static SinglePrototype create() {
            return single;
    }
    // pattern prototype
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone();
        SinglePrototype singleProto = new SinglePrototype();
        singleProto.name = this.name;
        return singleProto;
    }
}