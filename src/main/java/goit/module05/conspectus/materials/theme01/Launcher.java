package goit.module05.conspectus.materials.theme01;

public class Launcher {
    public static void main(String[] args) {
        Shape circle = new Circle(5f);
        
        Star star = new Star();
        
        System.out.println("--------------");
        
        new User("Max");
        new User("Johny", true);
    }
}