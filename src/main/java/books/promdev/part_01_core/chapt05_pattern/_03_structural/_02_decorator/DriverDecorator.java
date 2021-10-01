package books.promdev.part_01_core.chapt05_pattern._03_structural._02_decorator;

public abstract class DriverDecorator extends Driver {
    protected Driver driver;
    
    public DriverDecorator(Driver driver) {
        this.driver = driver;
    }
    @Override
    public void doo() {
        driver.doo();
    }
}