package module04.homework.autocheck;

public class SpaceUtils {

    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount) {
        int count = 1;
        if (planetCount == count) {
            return "1 planet";
        }
        if (planetCount > count) {

        }
        return planetCount + " planets";
    }

    public static String generateStartMessage(String shipName, String time) {
        String message = "Ship " + shipName + " start at " + time;
        return message;
    }

    public static void main(String[] args) {
        System.out.println(SpaceUtils.PLANET_COUNT);
        System.out.println(SpaceUtils.pluralPlanets(1));
        System.out.println(SpaceUtils.pluralPlanets(5));

        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40"));
    }
}