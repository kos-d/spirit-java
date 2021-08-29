package module07_collection.conspectus.materials.theme04;

public class Main {
    public static void main(String[] args) {
        
        String yesName = TrueOrFalse.yes.name();
        System.out.println(yesName);
        
        System.out.println("---------------------");
        
        TrueOrFalse valueOf = TrueOrFalse.valueOf("yes");
        System.out.println(valueOf);
        
        System.out.println("---------------------");
        
        String toString = Planet.Earth.toString();
        System.out.println(toString);
        
        System.out.println("---------------------");
        
        int ordinal = Planet.Mars.ordinal();
        System.out.println(ordinal);
    }
}