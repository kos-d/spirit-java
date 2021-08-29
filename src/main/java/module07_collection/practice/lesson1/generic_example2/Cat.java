package module07_collection.practice.lesson1.generic_example2;

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