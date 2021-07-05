package module04.conspectus.materials.theme03;

public class MainApp {
    public static void main(String[] args) {
        StarShip ship1 = new StarShip();
        ship1.fuel = 100;
        ship1.name = "Earthwalker";
        
        System.out.println(ship1.fuel);
        
        StarShip ship2 = new StarShip();
        ship2.name = "Marswarrior";
        
        System.out.println(ship1.name);
        System.out.println(ship2.name);
        
        Planet planet = new Planet();
        planet.name = "Earth";
        
        System.out.println(planet.name);
        
        Human human = new Human();
        human.name = "Max";
        human.printNameParameter("Elon");
        
        human.printName("Elon");
    }
}