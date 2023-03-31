public class TwoSum {

 public int[] twoSum(int[] nums, int target) {
        int difference = 0;
        int currentNumber = 0;
        int[] result = {0,0};
        for (int i = 0; i< nums.length; i++) {
            currentNumber = nums[i];
            difference = target - currentNumber;
            for (int j = i+1; j<nums.length; j++) {
                if (nums[j] == difference) {
                    result[0]=i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    
}
