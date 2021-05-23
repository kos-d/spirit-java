package module07.practice.lesson2.generic_example3;

public interface IAnimal<T> {
    
    public void move(int x, int y);
    String voice();
    T description();
}
