package Leetcodes;

import java.util.Arrays;

public class maxSubArray {
    public static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
