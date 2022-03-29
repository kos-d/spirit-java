package goit.module05.conspectus.video.lesson01;

public class Cat extends Animal {
    private String name;
    private String color;
    private String catHouse;
    private static String catFood;
    
    {
        this.catHouse = "Kiev";
        System.out.println("Non-static child block");
    }
    
    static {
        catFood = "Fish";
        System.out.println("Static child block");
    }
    
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("Child constructor");
        
    } 
    
//    public Cat(String gender) {
//        super(gender);
//    }
    
//    public Cat(String name, String color, String gender) {
//        this(gender);
//        this.name = name;
//        this.color = color;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}