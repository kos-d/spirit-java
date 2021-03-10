package module03.conspectus.video.ifelseswitch;

import java.util.Random;

public class IfElseSwitchApp {
    public static void main(String[] args) {
        /*
        if (expression/boolean) {   (выражение)
            //statement             (условие)
        }
        */
        //boolean is18YearsOld = getRandomBoolean();
        //System.out.println("Boolean value " + is18YearsOld);
        int age = getRandomInt();

        System.out.println("Age: " + age);
        

       // if(is18YearsOld) {                                      // если
        if(age >=  18) {
            System.out.println("Join if statement");
            System.out.println("Show all news");
            System.out.println("News displayed");
        } else if (age >= 14) {                                                // тогда
            System.out.println("Join else statement");
            System.out.println("Show news for kids");
            System.out.println("News displayed");
        } else {
            System.out.println("We will not display news!");
        }
    }
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(20);
    }
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
