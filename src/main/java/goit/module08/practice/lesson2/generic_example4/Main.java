package goit.module08.practice.lesson2.generic_example4;

public class Main {
    public static void main(String[] args) {
        
        // AnimalServiseImpl example        
        Cat findById = new CatService().findById(1L);
        Dog findById1 = new DogService().findById(1L);
    }
}