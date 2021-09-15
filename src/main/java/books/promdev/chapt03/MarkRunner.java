package books.promdev.chapt03;

public class MarkRunner {
    public static void main(String[] args) {
        Mark ob1 = new Mark();
        Mark ob2 = new Mark();
        
        Mark.coeff = 7;
//        Mark.setCoeffFloat(10.0F);
        
        double result = ob1.getResult();
        
        System.out.println(result);
        
//        float z = Math.max(x, y);

//        System.exit(1);
    }
}