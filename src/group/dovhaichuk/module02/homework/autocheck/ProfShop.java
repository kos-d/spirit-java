package module02.homework.autocheck;

public class ProfShop {
    public boolean isPriceOk(int price) {
       return price != 1000; 
    }

    public float calculateRegularDiscountPrice(float price) {
        return (price * 90) / 100 ;
    }
    public boolean isDiscount50(int price) {
        return (price * 4 == 1000);
    }

    public boolean isPriceHappy(int price, int year, int day) {
        if (price == year * day) {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        ProfShop profShop = new ProfShop();
        System.out.println(profShop.isPriceOk(1000));
        System.out.println(profShop.isPriceOk(1500));
        System.out.println(profShop.calculateRegularDiscountPrice(1500));
        System.out.println(profShop.isDiscount50(256));
        System.out.println(profShop.isPriceHappy(237000, 3950, 6));
    }
}