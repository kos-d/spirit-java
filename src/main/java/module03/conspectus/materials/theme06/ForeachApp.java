package module03.conspectus.materials.theme06;

public class ForeachApp {
    public static void main(String[] args) {
        
//        for(type item : iterableValue) {
//            Do something
//        }
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        for (String season : seasons) {
            System.out.println(season);
        }
        
        System.out.println("-------------");
        
        for (int i = 0; i < seasons.length; i++) {
            String season = seasons[i];
            System.out.println(season);
        }
        
        System.out.println("-------------");
        
        ForeachApp app = new ForeachApp();
        
        String[] arr = new String[] {"test", "beta", "sinus"};
        
        
        System.out.println(app.isArrayContainsValue(arr, "test"));
        System.out.println(app.isArrayContainsValue(arr, "bean"));
        
    }
    
    public boolean isArrayContainsValue(String[] names, String searchName) {
        for (String name : names) {
            if (name.equals(searchName)) {
                return true;
            }
        }
        return false;
     }
}