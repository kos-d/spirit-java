package module07_collection.conspectus.materials.theme04;

public class Seasons {
    public static final int SUMMER = 1;
    public static final int AUTUMN = 2;
    public static final int WINTER = 3;
    public static final int SPRING = 4;
    
    public String getSeason(int season) {
        switch(season) {
            case SUMMER: return "Summer";
            case AUTUMN: return "Autumn";
            case WINTER: return "Winter";
            case SPRING: return "Spring";
//            default: 
//                System.out.println("Unknown season id: " + season);
//                break;
        } 
        throw new IllegalArgumentException("Unknown season id: " + season);
//        return getSeason(season);
    }
    
    public static void main(String[] args) {
        Seasons s = new Seasons();
        System.out.println(s.getSeason(Seasons.SUMMER));
    }
}