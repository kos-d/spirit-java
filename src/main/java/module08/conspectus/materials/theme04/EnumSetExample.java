package module08.conspectus.materials.theme04;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import module07.conspectus.materials.theme04.DeveloperLevel;

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<DeveloperLevel> experiencesLevels = EnumSet.of(DeveloperLevel.MIDDLE, DeveloperLevel.SENIOR);
        
        System.out.println(experiencesLevels);
        
        EnumMap<DeveloperLevel, List<Developer>> developers = new EnumMap<DeveloperLevel, List<Developer>>(DeveloperLevel.class);
    }
}