package books.promdev.part_01_core.chapt02.test;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExampleMain {
    public static void main(String[] args) {
        EnumMap<DayOfWeek, String> activityMap = new EnumMap<>(DayOfWeek.class);
        activityMap.put(DayOfWeek.MONDAY, "Soccer");
        activityMap.put(DayOfWeek.TUESDAY, "Tenis");
        activityMap.put(DayOfWeek.WEDNESDAY, "Basketball");
        
        EnumMap<DayOfWeek, String> activityMapCopy = new EnumMap<>(DayOfWeek.class);
        
    }
}