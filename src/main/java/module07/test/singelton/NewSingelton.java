package module07.test.singelton;

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