package goit.module05.conspectus.materials.theme02;

public class Child extends Parent {
    {
        System.out.println("Child initialization block");
    }
    static {
        System.out.println("Child static block");
    }
    public Child() {
        System.out.println("Child Constructor");
    }
    
    public static void main(String[] args) {
        new Child();
    }
}