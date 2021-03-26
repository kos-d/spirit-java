package module04.homework.autocheck;

public class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}
class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.println(altimeter);
        System.out.println(airGauge);
    }
}
class Altimeter {
    @Override
    public String toString() {
        String message = "Measure height";
        return message;
    }
}
class AirGauge {
    @Override
    public String toString() {
        String message = "Measure air pressure";
        return message;
    }
}