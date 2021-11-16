package books.guide.chapt04;

public class Factor {
    boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        else return false;
    }
}