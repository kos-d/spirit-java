package module07_collection.practice.lesson2.generic_example3;

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