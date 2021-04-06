
package module05.practice.lesson2.fabricmethod;

public interface IAnimal {
    
    //field only public, static, final 
    
    default void move(int x, int y) {
        System.out.println("move from interface IAnimal");        
    }
    // methods only public, abstract
    //void move(int x, int y);
    String voice();
    
}
