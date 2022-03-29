package goit.module05.conspectus.materials.theme02;

public class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
    static {
        System.out.println("Parent static block");
    }
    {
        System.out.println("Parent initialisation block");
    }
}