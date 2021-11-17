package books.guide.chapt02.practice2_1.task1;

public class SoundSpeed {
    private final double SOUND_TRAVEL_SPEED = 1100;
    public double timeInSecond;
    public boolean isEcho;
    private int distanceDivisor;
    
    double getResult() {
        if (isEcho) {
            distanceDivisor = 2;
        } else {
            distanceDivisor = 1;
        }
        return (timeInSecond * SOUND_TRAVEL_SPEED) / distanceDivisor;
    }
}