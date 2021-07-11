package module02.conspectus.materials.theme02;

public class FloatMain {
    public static void main(String[] args) {
        // Диапазон значений - от -3.4*10 в 38 степени до 3.4*10 в 38 степени. Занимает 4 байта.
        float length = 50f;
        float weight = 3.5f;
        
        float f1 = 10.0f;
        float f2 = 15f;
        float f3 = 43F;
        float f4 = .5f; // аналогично записи 0.5f
        
        System.out.println(length + " " + weight);
    }
}