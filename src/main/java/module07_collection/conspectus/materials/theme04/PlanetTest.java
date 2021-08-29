package module07_collection.conspectus.materials.theme04;

public class PlanetTest {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet.name());
        }
        System.out.println("---------------------");
        int earthIndex = Planet.Earth.ordinal();
        
        Planet earth;
        earth = Planet.values()[earthIndex];
        
        System.out.println(earth.name());
        
    }
}