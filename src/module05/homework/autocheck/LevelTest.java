package module05.homework.autocheck;

import java.util.Arrays;

public class LevelTest {
    public static void main(String[] args) {
        //System.out.println(new Level("Test"));
        
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        //System.out.println(new Level("Test", points));
        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");
        System.out.println(new Level(info, points));
        
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}
class Level {
    //private String levelName;
    private LevelInfo levelInfo;
    private Point[] points;
    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }
    
    public Point[] getPoint() {
        return points;
    }
    
    @Override
    public String toString() {
        String infoLevelName = "Quarke level, name is " + levelInfo.getName();        
        String infoLevelDifficulty = ", difficulty is " + levelInfo.getDifficulty();
        String infoLevelPoints = ", point count is " + points.length;
        return infoLevelName + infoLevelDifficulty + infoLevelPoints;
    }
    static class Point {
        private int x;
        private int y;
        
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX() {
        return x;
    }
        public int getY() {
            return y;
        }
    }
    static class LevelInfo {
        private String name;
        private String difficulty;
        
        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
        public String getName() {
            return name;
        }
        public String getDifficulty() {
            return difficulty;
        }
    }
    
    public int calculateLevelHash() {
        int resultHash = 0;
        int tmp;
        for (int i = 0; i < points.length; i++) {
            tmp = points[i].getX() * points[i].getY();
            resultHash += tmp;
        }
        return resultHash;
    }
}    