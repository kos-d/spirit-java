package goit.module04.conspectus.video.lesson02;


public class SortUtil {    
    public int[] sortIntArray(int[] inputData) {
        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length - i - 1; j++) {
                if (inputData[j] > inputData[j + 1]) {
                    swapElement(inputData, j);
                }
            }
        }
        return inputData;
    }
    
    private void swapElement(int[] inputData, int j) {
        int temp = inputData[j];
        inputData[j] = inputData[j + 1];
        inputData[j + 1] = temp;
    }
}