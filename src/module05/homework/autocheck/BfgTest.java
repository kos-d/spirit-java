package module05.homework.autocheck;

public class BfgTest {
    public static void main(String[] args) {
        System.out.println(new BFG(10000, 300, "ExtraGun"));
        System.out.println(new BFG(5000, 200));
        System.out.println(new BFG(2000));
        System.out.println(new BFG());
    }
}
class BFG {
    private int ammo;
    private int damage;
    private String name;

    public int getAmmo() {
        return ammo;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }

    public BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }
    public BFG(int ammo, int damage) {
        this(ammo, damage, "BFG");
    }
    public BFG (int ammo) {
        this(ammo, 50, "BFG");
    }
    public BFG() {
        this(1000, 50, "BFG");
    }
    @Override
    public String toString() {
        return getName() + ", ammo: " + getAmmo() + ", damage: " + getDamage();
    }
}