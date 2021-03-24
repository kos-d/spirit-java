package module04.homework.autocheck;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String stringCount = String.valueOf(count);
        char[] arrCount = stringCount.toCharArray();
        String result = "";
        String thousandStars;    //X
        String hundredStars;     //Y
        String tenStars;         //Z
        String oneStar;          //*


        if (arrCount.length == 1) {
            result = result +       "*".repeat(Character.getNumericValue(arrCount[0]));
        }

        if (arrCount.length == 2) {
            tenStars =       "Z".repeat(Character.getNumericValue(arrCount[0]));
            oneStar =        "*".repeat(Character.getNumericValue(arrCount[1]));
            result = result + tenStars + oneStar;
        }

        if (arrCount.length == 3) {
            hundredStars =   "Y".repeat(Character.getNumericValue(arrCount[0]));
            tenStars =       "Z".repeat(Character.getNumericValue(arrCount[1]));
            oneStar =        "*".repeat(Character.getNumericValue(arrCount[2]));
            result = result + hundredStars + tenStars + oneStar;
        }

        if (arrCount.length == 4) {
            thousandStars =  "X".repeat(Character.getNumericValue(arrCount[0]));
            hundredStars =   "Y".repeat(Character.getNumericValue(arrCount[1]));
            tenStars =       "Z".repeat(Character.getNumericValue(arrCount[2]));
            oneStar =        "*".repeat(Character.getNumericValue(arrCount[3]));
            result = result + thousandStars + hundredStars + tenStars + oneStar ;
        }
        return result;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
