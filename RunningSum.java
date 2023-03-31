//https://leetcode.com/problems/running-sum-of-1d-array/
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

class Solution {
       public int[] runningSum(int[] nums) {
        int[] nums2 = new int[nums.length];
        nums2[0] = nums[0];
        for (int i=1; i<nums.length; i++){      
              nums2[i] = nums2[i-1] + nums[i] ;         
        }
        return nums2;
    }
}
