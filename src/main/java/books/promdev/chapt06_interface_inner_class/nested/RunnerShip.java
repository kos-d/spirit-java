package books.promdev.chapt06_interface_inner_class.nested;

public class RunnerShip {
    public static void main(String[] args) {
        Ship.LifeBoat.down();
        Ship.LifeBoat lf = new Ship.LifeBoat();
        
        lf.swim();
    }
}