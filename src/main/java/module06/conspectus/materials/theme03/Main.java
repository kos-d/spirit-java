package module06.conspectus.materials.theme03;

public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            result.append("" + i + '\n');
        }
        System.out.println(result);
    }
}