package module07_collection.conspectus.materials.theme04;

public class ColdDetector {
    public boolean isCold(Season season) {
        if (season == Season.Summer || season == Season.Autumn) {
            return true;
        }
        return false;
    }
}