package module05.homework.autocheck;

public class TexturePoolTest {
    public static void main(String[] args) {
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
class TexturePool {
    private String textureName;
    
    private TexturePool() {}
    
    private static TexturePool instance = new TexturePool();
    
    public static TexturePool getInstance() {
        //return TexturePool.instance;
        return instance;
    }
    
    public String getTextureName() {
        return textureName;
    }
    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}