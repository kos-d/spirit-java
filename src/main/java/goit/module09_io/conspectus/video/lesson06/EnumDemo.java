package goit.module09_io.conspectus.video.lesson06;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class EnumDemo {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
//        workDayOrNot(day);
        
        DayOfWeek[] values = DayOfWeek.values();
        System.out.println(Arrays.toString(values));        
        DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        System.out.println(friday);        
        String name = friday.name();
        System.out.println(name);        
        String dayOfWeek = friday.getDayOfWeek();
        Integer dayIdentifier = friday.getDayIdentifier();
        System.out.println("name: " + name + " dayOfWeek: " + dayOfWeek + " dayIdentifier: " + dayIdentifier);
        
        day.workDayOrNot();
        
        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.of(DayOfWeek.FRIDAY, DayOfWeek.MONDAY);
        System.out.println(dayOfWeeks);
        EnumSet<DayOfWeek> dayOfWeeks1 = EnumSet.allOf(DayOfWeek.class);
        System.out.println(dayOfWeeks1);
        
        EnumMap<DayOfWeek, List<String>> dayPlans = new EnumMap<>(DayOfWeek.class);
        dayPlans.put(DayOfWeek.MONDAY, Arrays.asList("Сдать тестирование", "Зачислиться в группу trainee"));
        System.out.println(dayPlans);
    }
    
//    private static void workDayOrNot(DayOfWeek day) {
//        switch (day) {
//            case SUNDAY:
//            case SATURDAY:
//                System.out.println("Free day");
//                break;
//            case MONDAY:
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                System.out.println("Work day");
//                break;
//            default:
//                System.out.println("Wrong day, please specify a correct one");
//        }
//    }
}