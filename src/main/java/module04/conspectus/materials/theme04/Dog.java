package module04.conspectus.materials.theme04;

public class Dog {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void woof() {
        System.out.println(name + " - woof, woof");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Axe");
        dog.woof();
    }
}