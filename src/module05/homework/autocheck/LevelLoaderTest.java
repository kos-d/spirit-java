package module05.homework.autocheck;

public class LevelLoaderTest {
    public static void main(String[] args) {
        //LevelLoader levelLoader = new LevelLoader();
        
        //System.out.println(levelLoader.load("StartLevel"));
        
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
        
        System.out.println(LevelLoader.getInstance() == LevelLoader.getInstance());
        
    }
}

class LevelLoader {
    public static LevelLoader instance = new LevelLoader();
    
    public static LevelLoader getInstance() {
        return instance;
    }
    
    String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}