package module05.practice;

public class Main {
    
    private String name;
    private int age;

    // constructor 
    public Main(String name) {
        this.name = name;
    }
    
    public Main(String name, int age) {
        this(name);
        //this.name = name;
        this.age = age;
    }
    
    
    public static void main(String[] args) {
        
    }
}