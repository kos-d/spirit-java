package module03.conspectus.video.lesson01;

import java.util.Random;

public class SwitchCaseApp {
    public static void main(String[] args) {

        int randomInt = getRandomInt();
        System.out.println("Number is " + randomInt);

        switch (randomInt) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number");
                
        }
    }
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(3);
    }
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}








/*
    switch (expression > 10) {

        case true :
        //some code
        break;
        case false :
        //some code
        break;
        
    }


    switch (expression) {
        case expression > 10 :
            //some code
            break;
        case expression < 10 :
            //some code
            break;

        
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
*/


/*
        int randomInt = getRandomInt();
        System.out.println("randomInt() = " + randomInt);


        System.out.println(randomInt < 10 ? getRandomInt() : getRandomBoolean());
/*
        if (randomInt < 10) {
            getRandomInt();
        } else {
            getRandomBoolean();
        }
       System.out.println("randomInt = " + randomInt);
      //  System.out.println("getRandomInt() = " + getRandomInt());
      //  System.out.println("getRandomBoolean() = " + getRandomBoolean());
        
        //int result;

  //      System.out.println((randomInt > 0) ? getRandomInt() : getRandomBoolean());
        
        if (randomInt > 10) {
            System.out.println("randomInt if = " + randomInt);
            result = 1;
        } else {
            System.out.println("randomInt else = " + randomInt);
            result = 2;
        }

//        result = (randomInt > 10) ? 1 : 2;
//        result = (randomInt > 10) ? getRandomInt() : getRandomBoolean();
//        System.out.println("randomInt = " + randomInt);
        //System.out.println("result = " + result);
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


        int age = getRandomInt();

        System.out.println("age " + age);
        if (age >= 18) {
            if (age > 40) {
                System.out.println("Skip computer games news");
                if (age > 60) {
                    System.out.println("Skip children news");
                }
            
            }
            System.out.println("Join if statement");
            System.out.println("Show all news");
            System.out.println("News displayed");
        } else if (age >= 14) {
            System.out.println("Join else if statement");
            System.out.println("Show news for kids");
            System.out.println("News displayed");
        } else {
            System.out.println("We will not display news!");

        }
    }

    public static int  getRandomInt() {
        Random random = new Random();
        return random.nextInt(20);
    }

    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
      
        if (expression/boolean) {   (выражение)
            //statement             (условие)
        }
        
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
            //do nothing
            //NOP
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
*/
