package books.promdev.part_02_libraries.chapt08;

public class StudentFinally {
    private static int age;
    
    public static void setAge(int age) {
        try {
            if (age <= 0)
            throw new RuntimeException("can not be");
        } finally {
            System.out.print("freeing resources");
        }
        System.out.print("end method");
    }
    public static int getAgeWoman() {
        try {
            return age - 3;
        } finally {
            return age;
        }
    }
    public static void main(String[] args) {
        try {
            setAge(23);
            setAge(-5);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.print(getAgeWoman());
    }
}
