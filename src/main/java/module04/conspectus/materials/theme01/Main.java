package module04.conspectus.materials.theme01;

public class Main {
    public static void main(String[] args) {
        Quad quad = new Quad();
        quad.setSide(5);
        System.out.println(quad.getArea());
        
        Qube qube = new Qube();
        qube.setSide(5);
        System.out.println(qube.getArea());
        System.out.println(qube.getVolume());
        
        Circle circle = new Circle();
        circle.setRadius(1);
        
        AreaPrinter print = new AreaPrinter();
        print.printArea(quad);
        print.printArea(circle);
        
    }
}