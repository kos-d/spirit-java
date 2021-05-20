package module05.homework.autocheck;

public class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();
        
        menu.act(new GameMenu.Options());
        menu.act(new GameMenu.Start());
        menu.act(new GameMenu.Exit());
    }
}
class GameMenu {
    
    abstract static class MenuItem {
        abstract String getAction(); 
    }
    
    static class Start extends MenuItem {
        @Override
        String getAction() {
            return "start";
        }
    }
    
    static class Options extends MenuItem {
        @Override
        String getAction() {
            return "options";
        }
    }
    
    static class Exit extends MenuItem {
        @Override
        String getAction() {
            return "exit";
        }
    }
    
    void act(MenuItem item) {
        System.out.println(item.getAction());
    }
}