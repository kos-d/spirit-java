package books.guide.chapt01._task;

public class WeightOnTheMoon {
    public static void main(String[] args) {
        double earth_gravity, moon_gravity, my_weight, moon_weight;
        my_weight = 80;
        moon_gravity = 17;
        earth_gravity = 100;
        moon_weight = (moon_gravity / earth_gravity) * my_weight;
        
        System.out.println("My weighs on moon equals: " + moon_weight + " kg");
    }
}