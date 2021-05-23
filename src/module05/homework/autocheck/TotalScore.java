package module05.homework.autocheck;

public class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        //int index = 0;
        
        for (int index : scores) {
            result += index;
        }
        return result;
    }
    
    /*
    public int sum(int[] scores) {
        int result = 0;
        int index = 0;
        
        while (true) {
            try {
                result += scores[index++];
            } catch (IndexOutOfBoundsException ex) {
                break;
            }
        }
        return result;
    }
    */
}
class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};
        
        System.out.println(new TotalScore().sum(score));
    }
}