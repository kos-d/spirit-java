package module08.conspectus.materials.theme03;

import java.util.ArrayList;
import java.util.List;

public class Planets {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        
        for (String planet : planets) {
            System.out.println(planet);
        }
        
        System.out.println();
        
        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            System.out.println(planet);
        }
        
        System.out.println();
        
        System.out.println(planets.get(0));                     // first element
        
        System.out.println(planets.get(planets.size() - 1));    // last element
    }
}