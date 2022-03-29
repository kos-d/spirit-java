package goit.module02_primitive.homework.autocheck;

class ScoreCounter {
    
    // nonStatic method addScore 
    public int addScore(int currentScore, int amount) {
        currentScore += amount;
        return currentScore;
    }
    // nonStatic method twiceScore
    public int twiceScore(int currentScore) {
        currentScore *= 2;
        return currentScore;
    }
    
    // Expected output
    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5));
        System.out.println("twiceScore(7) = " + counter.twiceScore(7));
    }
}
