package books.methods.chapter02;

public class TernarExample {
    public static void main(String[] args) {
        int result = defineBonus(1);
        int result1 = defineBonus(2);
        int result2 = defineBonus(3);
        int result3 = defineBonus(4);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    static int defineBonus(int purchaseItem) {
            int bonus;
            bonus = purchaseItem > 3 ? 10 : 0;
            return bonus;
        }
}