package module06.homework.autocheck;

class NumberJoinerTest {
    public static void main(String[] args) {
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}
class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
        }
        return result.toString();
    } 
}
/*
class NumberJoiner {
    public String join(int[] numbers) {
        String result = "";
        for (int number: numbers) {
            result += number;
        }
        return result;
    }

*/