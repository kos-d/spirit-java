package goit.module05.conspectus.video.lesson01;

public class Dog extends Animal {
    
    private static int paws = 4;
    
    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public void howManyPaws() {
        System.out.println("Dog howManyPaws method");
        System.out.println(paws);
    }
    
}