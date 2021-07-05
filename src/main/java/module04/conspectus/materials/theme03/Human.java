package module04.conspectus.materials.theme03;

public class Human {
    String name;
    
    public void printNameParameter(String name) {
        System.out.println(name);
    }
    public void printName(String name) {
        System.out.println(name + " " + this.name);
    }
}