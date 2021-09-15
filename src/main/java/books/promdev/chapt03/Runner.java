package books.promdev.chapt03;

public class Runner {
    public static void main(String[] args) {
        Point t1 = new Point(5, 10);
        Point t2 = new Point(2, 6);
        System.out.print("distance is : " + new LocateLogic().calculateDistance(t1, t2));
    }
}