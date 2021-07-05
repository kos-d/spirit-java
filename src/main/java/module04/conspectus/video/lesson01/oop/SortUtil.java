package module04.conspectus.video.lesson01.oop;

public class SortUtil {    
    public int[] sortIntArray(int[] inputData) {
        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length - i - 1; j++) {
                if (inputData[j] > inputData[j + 1]) {
                    int temp = inputData[j];
                    inputData[j] = inputData[j + 1];
                    inputData[j + 1] = temp;
                }
            }
        }
        return inputData;
    }
}