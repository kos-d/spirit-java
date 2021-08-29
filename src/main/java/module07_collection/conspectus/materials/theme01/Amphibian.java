package module07_collection.conspectus.materials.theme01;

public class Amphibian implements UniversalTransport {
    @Override
    public void fly() {
        System.out.println(getName() + " fly");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swim");
    }

    public String getName() {
        return "Amphibian";
    }
    
    
}