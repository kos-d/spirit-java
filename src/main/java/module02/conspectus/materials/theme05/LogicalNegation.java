package module02.conspectus.materials.theme05;

public class LogicalNegation {
    public static void main(String[] args) {
        // Записывается символом ! перед выражением. 
        // Изменяет значение выражения с true на false и наборот - то есть, инвертирует выражение:
        
        boolean theWeatherIsGood = false;
        theWeatherIsGood = !theWeatherIsGood;
        
        System.out.println(theWeatherIsGood);
    }
}