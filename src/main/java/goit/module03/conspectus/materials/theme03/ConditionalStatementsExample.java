package goit.module03.conspectus.materials.theme03;

public class ConditionalStatementsExample {
    public static void main(String[] args) {
        
        boolean isNight = true;
        if (isNight) {
            lightOn();
        }
        int batteryPercent = 50;
        if (batteryPercent > 80) {
        moveOn();
    
        } else {
            moveOff();
        }
        
        String skyColor = "black";
        if (skyColor.equals("blue")) {
            System.out.println("Night");
        } else {
            System.out.println("Day");
        }
        
        int number = 10;
        
        if (number < 10) {
            System.out.println("Number < 10");
        } else if (number < 100){
            System.out.println("10 < Number < 100");
        } else {
            System.out.println("Number > 100");
        }
        float calculateFinalPrice = calculateFinalPrice(12, true, false);
        System.out.println(calculateFinalPrice);
        
        int simpleCalculate = simpleCalculateFinalPrice(10, false, true);
        System.out.println(simpleCalculate);
    }
    
    public static float calculateFinalPrice(float price, boolean isOutlet, boolean isBlackFriday) {
        float result = price;
        if (isBlackFriday) {
            result = price / 2;
        } else {
            if (isOutlet) {
                result = price * 9 / 10;
            } else {
                result = price;
            }
        }
        return result;
    }
    
    public static int simpleCalculateFinalPrice(int newPrice, boolean isOutlet, boolean isBlackFriday) {
        
        if (isBlackFriday) {
            return newPrice / 2;
        }
        if (isOutlet) {
            return newPrice * 9 / 10;
        }
        return newPrice;        
    }
    

    private static void lightOn() {
        System.out.println("Message - Lights On");
    }

    private static void moveOn() {
        System.out.println("Move On");
    }

    private static void moveOff() {
        System.out.println("Move Off");
    }
}