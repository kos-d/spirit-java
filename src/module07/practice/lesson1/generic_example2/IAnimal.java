package module07.practice.lesson1.generic_example2;

public interface IAnimal<T> {
    
    public void move(int x, int y);
    String voice();
    T description();
}
