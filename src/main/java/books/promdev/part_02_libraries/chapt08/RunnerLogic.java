package books.promdev.part_02_libraries.chapt08;

public class RunnerLogic {
    public static double salary(int coeff) throws SalaryException {
        double d;
        try {
            if ((d = 10 - 100 / coeff) < 0) 
                throw new SalaryException("negative salary");
            else return d;
        } catch (ArithmeticException e) {
            throw new SalaryException("div by ze", e);
        }
    }
    public static void main(String[] args) {
        try {
            double res = salary(71);
        } catch (SalaryException e) {
            System.err.println(e.toString());
            System.err.println(e.getHiddenException());
        }
    }
}
