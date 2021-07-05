package module05.conspectus.video.lesson03;

public class ExceptionsExampleCustom {
    public static void main(String[] args) {
        try {
            checkIfItIsInteger("123");
        } catch (IncorrectNumberFormatException e) {
            System.out.println("You passed wrong number, please try again");
        } finally {
            
        }
    }

    private static void checkIfItIsInteger(Object o) {
        if (o instanceof Integer) {
            System.out.println((Integer)o);
        } else {
            throw new IncorrectNumberFormatException("s object should instanceof Integer class");
        }
    }
}