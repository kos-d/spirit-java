package module03.homework.autocheck;

public class CaptainDispute {

    /*public String evenOrOdd(int number) {
        if (number%2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }*/
    public String evenOrOdd(int number) {
        String s = number % 2 == 0 ? "even" : "odd";
        return s;
    }


    public static void main(String[] args) {
        CaptainDispute captainDispute = new CaptainDispute();

        //Should be even
        System.out.println(captainDispute.evenOrOdd(10));

        //Should be odd
        System.out.println(captainDispute.evenOrOdd(5));
    }
}
