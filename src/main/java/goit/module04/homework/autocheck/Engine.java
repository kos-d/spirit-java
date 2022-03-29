package goit.module04.homework.autocheck;

public class Engine {
    private int power;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getFuelType() {
        String typeFuel = "A500";
        return typeFuel;
    }

    public static void main(String[] args) {
        Engine engine = new Engine();
        System.out.println(engine.getFuelType());

        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType());

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType());
        System.out.println("=============");
        AdvancedXFuelEngine advancedEngine = new AdvancedXFuelEngine();
        advancedEngine.setPower(1000);
        advancedEngine.setSerialNumber("SN504030");
        advancedEngine.printInfo();

    }
}
class XFuelEngine extends Engine {

    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getFuelType() {
        String xTypeFuel = "XFuel";
        return xTypeFuel;
    }
}
class AdvancedXFuelEngine extends XFuelEngine {

    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + getPower());
    }
}
