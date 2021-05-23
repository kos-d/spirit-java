package module07.conspectus.materials;

public class KeyValuePair<K, V> {
    private K key;
    private V value;
    
    public K getKey() {
        return key;
    }
    
    public void setKey(K key) {
        this.key = key;
    }
    
    public V getValue() {
        return value;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
    
    public String toString() {
        return key + " = " + value;
    }
}

class KeyValueTest {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
        javaSalary.setKey("Java");
        javaSalary.setValue(5000);
        System.out.println("Salary: " + javaSalary);
    }
}