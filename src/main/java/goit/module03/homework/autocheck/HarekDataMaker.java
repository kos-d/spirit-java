package goit.module03.homework.autocheck;
import java.util.Arrays;
public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {
        String form = "name - " + name + ", " + "age - " + age + ", " + "planet - " + planet;
        return form;
    }

    public String[] aggregateAll(String[] names, int[] age, String[] planets) {
            String[] result = {
                    aggregateSingle(names[0], String.valueOf(age[0]), planets[0]),
                    aggregateSingle(names[1], String.valueOf(age[1]), planets[1]),
                    aggregateSingle(names[2], String.valueOf(age[2]), planets[2]),
            };
        return result;
    }

    public static void main(String[] args) {

        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));

    }
}
