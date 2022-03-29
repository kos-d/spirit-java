package goit.module05.conspectus.video.lesson01;

public class Animal {
    private int paws = 4;
    
//    private String gender;
//    
    public Animal() {
        System.out.println("Animal constructor");
        howManyPaws();
    }
//
//    public Animal(String gender) {
//        this.gender = gender;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
    {
        System.out.println("Non-static parent block");
    }
    
    static {
        System.out.println("Static parent block");
    }
    
//    public Animal() {
//        System.out.println("Parent constructor");
//    }
    
    public void howManyPaws() {
        System.out.println(paws);
    }
}