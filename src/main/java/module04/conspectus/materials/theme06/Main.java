package module04.conspectus.materials.theme06;

public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        String info = rocket.toString();
        System.out.println(info);
        
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(5);
        
        Point p2 = new Point();
        p2.setX(50);
        p2.setY(100);
        
        Point p3 = new Point();
        p3.setX(10);
        p3.setY(5);
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        
        Class rocketClass = Rocket.class;
        System.out.println(rocketClass.getSimpleName());
        
        System.out.println("Test instanceof method");
        
        Object shape = new Shape();
        Object circle = new Circle();
        Object ship = new Ship();
        
        System.out.println(shape instanceof Shape);
        System.out.println(circle instanceof Shape);
        System.out.println(ship instanceof Shape);
    }
}
class Shape {
    
}
class Circle extends Shape {
    
}

class Ship {
    
}