package goit.module07_collection.practice.lesson1.generic_example2;

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