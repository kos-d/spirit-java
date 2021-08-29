package module07_collection.test.singelton;

public class NewSingelton {
    
    private NewSingelton() {
    }
    
    public static NewSingelton getInstance() {
        return NewSingeltonHolder.INSTANCE;
    }
    
    private static class NewSingeltonHolder {
        private static final NewSingelton INSTANCE = new NewSingelton();
    }
}