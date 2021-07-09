package module07.conspectus.video.lesson01;

public class Volvo implements Car, Transmission {
    @Override
    public void drive() {
        System.out.println("Drive safety");
    }
    
    @Override
    public int horsePower() {
        return 200;
    }
    
    @Override
    public void transmissionType() {
        System.out.println("Mechanic");
    }
}