package books.promdev.part_01_core.chapt05_pattern._03_structural._02_decorator;

public class Main {
    public static void main(String[] args) {
        Driver carDriver = new CarDriver();
        Main runner = new Main();
        runner.doDriver(carDriver);
        
        runner.doDriver(new BusDriver(carDriver));
        runner.doDriver(new CarDriverAndForwardingAgent(carDriver));
    }
     public void doDriver(Driver driver) {
        driver.doo();
    }
}