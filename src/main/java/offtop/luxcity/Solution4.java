package offtop.luxcity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution4 {
    public static void main(String[] args) {
        runCode();
        
        
    }
    /**
     * Implement method getResult
     */
    public static int getResult(List<Integer> nums) {
        // Write your code here...
        Collections.sort(nums);
        return nums.get(nums.size() -1) - nums.get(0);
    }

    public static void runCode() {
        int result = getResult(Arrays.asList(5,3,-6,9));
        System.out.println(result);
        // Entrypoint to debug your function
    }
}