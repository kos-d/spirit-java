package offtop.java_patterns.strategy.parkAuto;

public class ParkAuto {

    public static void main(String[] args) {
        
        Auto sedan = new Sedan();
        Auto hybrid = new HybridAuto();
        Auto f1car = new F1Car();
        Auto truck = new Truck();
        Auto toy = new ChildrenBuggies();

        sedan.fill();
        hybrid.fill();
        f1car.fill();
        truck.fill();
        toy.fill();
    }
}
