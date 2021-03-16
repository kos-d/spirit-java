package module04.homework.autocheck;

public class SpaceShip {
    //public String name = "Voyager";
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        System.out.println(ship.getName());
        ship.setName("Walker");
        System.out.println(ship.getName());
    }
}
