package module02.homework.autocheck;

public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }
    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return batteryPercent >= 90 && hillHeight <= 150;
    }
    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
       return isEngineWorking ^ isRobotStanding;
    } 
    public boolean shouldSleep(boolean isDayNow) {
        return !isDayNow;
    }    
    
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
        System.out.println("canOvercomeHole(100, 80) = " + robot.canOvercomeHole(80, 100));
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));
        System.out.println("canJumpOverHill(180, 100) = " + robot.canJumpOverHill(180, 100));
        System.out.println("areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));
        System.out.println("areSensorsOk(false, true) = " + robot.areSensorsOk(false, true));
        System.out.println("shouldSleep(true) = " + robot.shouldSleep(true));
        System.out.println("shouldSleep(false) = " + robot.shouldSleep(false));
    }
}
