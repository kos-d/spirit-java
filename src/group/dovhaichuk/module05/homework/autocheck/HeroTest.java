package module05.homework.autocheck;

public class HeroTest {
    public static void main(String[] args) {
        //Hero hero = new Hero();
        //Hero hero = new Hero("Stranger", 50);
        //Hero hero = new Hero("Stranger", 250);
        //new Hero("Stranger", 250).getHp();
        System.out.println(new Hero("Stranger", 250).getHp());

        /*System.out.println(hero.getName());
        System.out.println(hero.getHp());*/
    }
}
class Hero {
    private String name;
    private int hp;

    /*public Hero() {
        name = "Paratrooper";
        hp = 100;
    }*/
    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        if (hp < 0) {
            return;
        }
        if (hp >= 0 && hp <= 200) {
            this.hp = hp;
        }
        if (hp > 200) {
            this.hp = 200;
        }
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
