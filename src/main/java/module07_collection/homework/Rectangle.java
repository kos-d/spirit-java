package module07_collection.homework;

public class Rectangle extends Shape {
    
    private String name;
    
    public Rectangle(String name) {
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