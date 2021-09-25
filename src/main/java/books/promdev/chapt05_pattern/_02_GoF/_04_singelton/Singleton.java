package books.promdev.chapt05_pattern._02_GoF._04_singelton;

public class Singleton {
    private static Singleton instance = null;
//    private SingletonTrust() {
//        
//    }
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating Singelton");
            instance = new Singleton();
        }
        return instance;
    }
}