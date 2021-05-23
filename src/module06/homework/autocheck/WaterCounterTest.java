package module06.homework.autocheck;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));
        //0
        System.out.println(new WaterCounter().count("NoWater"));
        
    }
}
class WaterCounter {
    public double count(String text) {
        
        char[] textArr = text.toCharArray();        
        double countSymbols = text.length();        
        double countSpaces = 0;
        
        for (char character : textArr) {
            if (character == ' ') {
                countSpaces++;
            }
        }
        return countSpaces / countSymbols;
    }
}