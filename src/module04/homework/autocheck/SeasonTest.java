package module04.homework.autocheck;

public class SeasonTest {
    public String test(Season season) {
        return season.getName() +(season.isCold() ? " is cold" : " is warm");
    }
    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        System.out.println(seasonTest.test(new Winter()));
        System.out.println(seasonTest.test(new Spring()));
        System.out.println(seasonTest.test(new Summer()));
        System.out.println(seasonTest.test(new Autumn()));
    }
}
abstract class Season {
    public abstract String getName();
    public abstract boolean isCold();
}

class Winter extends Season {
    public String getName() {
        String seasonTitle = "winter";
        return seasonTitle;
    }
    public boolean isCold() {
        boolean isTrue = true;
        return isTrue;
    }
}
class Spring extends Season {
    public String getName() {
        String seasonTitle = "spring";
        return seasonTitle;
    }
    public boolean isCold() {
        boolean isFalse = false;
        return isFalse;
    }
}
class Summer extends Season {
    public String getName() {
        String seasonTitle = "summer";
        return seasonTitle;
    }
    public boolean isCold() {
        boolean isFalse = false;
        return isFalse;
    }
}
class Autumn extends Season {
    public String getName() {
        String seasonTitle = "autumn";
        return seasonTitle;
    }
    public boolean isCold() {
        boolean isTrue = true;
        return isTrue;
    }
}
