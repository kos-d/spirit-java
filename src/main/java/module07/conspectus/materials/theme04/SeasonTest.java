package module07.conspectus.materials.theme04;

public class SeasonTest {
    public static void main(String[] args) {
        SeasonFormatter sf = new SeasonFormatter();
        
        System.out.println(sf.getSeasonName(Season.Summer));
        
        ColdDetector cd = new ColdDetector();
        
        boolean hot = cd.isCold(Season.Summer);
        System.out.println(hot);
    }
}