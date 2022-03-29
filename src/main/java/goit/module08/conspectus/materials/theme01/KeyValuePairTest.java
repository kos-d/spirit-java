package goit.module08.conspectus.materials.theme01;

public class KeyValuePairTest {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
        KeyValuePair<Integer, Float> yearAvgTemperature = new KeyValuePair<Integer, Float>();
        
        javaSalary.setKey("Java");
        javaSalary.setValue(5000);
        
        yearAvgTemperature.setKey(3200);
        yearAvgTemperature.setValue(15f);

        System.out.println(javaSalary);
        System.out.println(yearAvgTemperature);
    }
}