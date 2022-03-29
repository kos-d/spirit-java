package goit.module05.conspectus.materials.theme03;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human() {
            @Override
            public void printName() {
                System.out.println("Name is " + getName());
            }
        };
        human.setName("Elon");
        
        human.printName();
    }
}