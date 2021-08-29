package module07_collection.conspectus.materials.theme04;

public class SeasonFormatter {
    public String getSeasonName(Season season) {
        switch(season) {
            case Summer: return "Summer";
            case Autumn: return "Autumn";
            case Winter: return "Winter";
            case Spring: return "Spring";
        }
        
        throw new IllegalArgumentException("We don't know name for " + season);
    }
}