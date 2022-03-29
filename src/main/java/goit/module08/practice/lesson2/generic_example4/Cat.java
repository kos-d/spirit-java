package goit.module08.practice.lesson2.generic_example4;

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