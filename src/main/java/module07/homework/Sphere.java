package module07.homework;

public class Sphere extends Shape {
    
    private String name;
    
    public Sphere(String name) {
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