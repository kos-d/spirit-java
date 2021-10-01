package books.promdev.part_01_core.chapt05_pattern._03_structural._02_decorator;

public class CarDriverAndForwardingAgent extends DriverDecorator {
    public CarDriverAndForwardingAgent(Driver driver) {
        super(driver);
    }
    private void addedBehaviorTwo() {
        System.out.println("I am a Forwarding Agent");
    }
    @Override
    public void doo() {
        driver.doo();
        addedBehaviorTwo();
    }
}