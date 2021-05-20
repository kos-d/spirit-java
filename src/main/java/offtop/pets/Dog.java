package offtop.pets;

public class Dog extends Pets {

    public int size;
    public String breed;
    public String name;

    @Override
    public String voice() {
        return "woof";
    }

    public void bark() {
        System.out.println("Woof, woof");
    }

}
