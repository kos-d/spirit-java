package module07.homework;

public class Circle extends Shape {
    
    private String name;
    
    public Circle(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String display() {
        String message = "This is " + getName() + "!";
        return message;
    }
}