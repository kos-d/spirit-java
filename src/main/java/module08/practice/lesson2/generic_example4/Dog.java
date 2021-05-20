package module08.practice.lesson2.generic_example4;

public class Dog extends Animal<DogDescription> {
    
    @Override
    public String voice() {
        return "gav";
    }

    @Override
    public DogDescription description() {
        return new DogDescription();
    }
}