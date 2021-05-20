package module08.practice.lesson2.generic_example4;

public interface IAnimal<T> {
    
    public void move(int x, int y);
    String voice();
    T description();
}
