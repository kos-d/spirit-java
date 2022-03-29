package goit.module02_primitive.homework.autocheck;

public class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        boolean result = number1 == number2;
        return result;
    }
    public boolean areNumbersFatal(int first, int second) {
        //return ((first * 5) + 3) == second; 
        return first * 5 + 3 == second;
    }
    public boolean canPrincessMarry(int day) {
        if (day <= 15) {
         return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3));
        System.out.println("areNumbersCool(5, 7) = " + helper.areNumbersCool(5, 7));
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8));
        System.out.println("areNumbersFatal(1, 9) = " + helper.areNumbersFatal(1, 9));
        System.out.println("canPrincessMarry(20) = " + helper.canPrincessMarry(20));
        System.out.println("canPrincessMarry(15) = " + helper.canPrincessMarry(15));
        System.out.println("canPrincessMarry(14) = " + helper.canPrincessMarry(14));
        
    }
}
