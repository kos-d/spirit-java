package goit.module07_collection.practice.lesson2.generic_example3;

public final class Cat extends Animal<CatDescription> {
    
    @Override
    public String voice() {
        return "mur";
    }
    
    @Override
    public CatDescription description() {
        return new CatDescription();
    }
}