package books.promdev.chapt03;

public class SimpleUseEnum {
    public static void main(String[] args) {
        Faculty current;
//        current = Faculty.GEO;
//        current = Faculty.MMF;
        current = Faculty.FPMI;
        switch (current) {
        case GEO:
            System.out.println(current);
            break;
        case FPMI:
            System.out.println(current);
            break;
        case MMF:
            System.out.println(current);
            break;
        default:
            System.out.println("of case: " + current);
        }
    }
}