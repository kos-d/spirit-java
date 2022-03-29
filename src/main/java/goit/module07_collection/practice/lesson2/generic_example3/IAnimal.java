package goit.module07_collection.practice.lesson2.generic_example3;

public interface IAnimal<T> {
    
    public void move(int x, int y);
    String voice();
    T description();
}
