package module05.homework.autocheck;

import java.util.Arrays;
import static java.lang.Math.*;

public class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };
        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);
        
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder {
    
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        double distance;
        double minDistance = Double.MAX_VALUE;
        int index = 0;
        
        for (int i = 0; i < targets.length; i++) {
            distance = getDistance(aiCoords[0], aiCoords[1], targets[i][0], targets[i][1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }
        return new int[]{targets[index][0], targets[index][1]};
    }
    public double getDistance(int startX, int startY, int endX, int endY) {
        return sqrt(pow(endX - startX, 2) + pow(endY - startY, 2));
    }
}