package books.promdev.part_01_core.chapt03;

public class DeanDemo {
    public static void main(String[] args) {
        Dean dn = Dean.valueOf("FPMI");
        System.out.print(dn.ordinal());
        System.out.println(" : " + dn + " : " + dn.getName());
    }
}