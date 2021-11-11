package books.promdev.part_02_libraries.chapt10.set;

import java.util.EnumSet;

public class UseEnumSet {
    public static void main(String[] args) {
        EnumSet<CarManufacturer> japanAuto = 
        EnumSet.range(CarManufacturer.TOYOTA, CarManufacturer.SUZUKI);
        
        EnumSet<CarManufacturer> other = EnumSet.complementOf(japanAuto);
        System.out.println(japanAuto);
        System.out.println(other);
            action("audi", japanAuto);
            action("suzuki", japanAuto);
    }
    public static boolean action(String auto, EnumSet<CarManufacturer> set) {
        CarManufacturer cm = CarManufacturer.valueOf(auto.toUpperCase());
        boolean ok = false;
        if (ok = set.contains(cm)) {
            System.out.println("Work: " + cm);
        } else {
            System.out.println("Not Work: " + cm);
        }
        return ok;
    }
}