package module08.conspectus.materials.theme04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SeasonTest {
    public static void main(String[] args) {
        Set<Season> seasons = new HashSet<>();
        seasons.add(Season.Winter);
        
        Map<Season, String> descriptions = new HashMap<>();
        descriptions.put(Season.Winter, "Winter is coming");
    }
}