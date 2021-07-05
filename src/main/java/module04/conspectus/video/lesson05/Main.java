package module04.conspectus.video.lesson05;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("White", "HP", 30, 100);
        System.out.println("Paint volume " + printer.getPaintVolume());
        
        Signature app = new Signature();
        app.methodB_1("Hello");
    }
}