package goit.module02_primitive.conspectus.materials.theme05_logical_operation;

public class LogicalNegation {
    public static void main(String[] args) {
        // Записывается символом ! перед выражением. 
        // Изменяет значение выражения с true на false и наборот - то есть, инвертирует выражение:
        
        boolean theWeatherIsGood = false;
        
        theWeatherIsGood = !theWeatherIsGood;
        
        System.out.println(theWeatherIsGood);   // true
    }
}