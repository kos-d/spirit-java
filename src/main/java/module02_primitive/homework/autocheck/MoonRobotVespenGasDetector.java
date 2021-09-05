package module02_primitive.homework.autocheck;

public class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
       return minAcid < acidValue & acidValue < maxAcid;
    }
    public boolean isDensityOk(int density) {
        return density >= 1000 && density <= 5000 || density >= 10000 && density <= 15000;
    }

    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }
    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return isAcidOk(acidValue, minAcid, maxAcid) && isDensityOk(density) && isTemperatureOk(cold);
    }
    public static void main(String[] args) {
        MoonRobotVespenGasDetector robot = new MoonRobotVespenGasDetector();

        System.out.println("isAcidOk(100, 50, 150) = " + robot.isAcidOk(100, 50, 150));
        System.out.println("isDensityOk(1500) = " + robot.isDensityOk(1500));
        System.out.println("isDensityOk(6000) = " + robot.isDensityOk(6000));
        System.out.println("isTemperatureOk(false) = " + robot.isTemperatureOk(false));
        System.out.println("isGroundOkForVespenGas(120, 75, 150, 7500, false) = " + robot.isGroundOkForVespenGas(120, 75, 150, 7500, false));
    }
}