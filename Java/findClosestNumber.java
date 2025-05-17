package Leetcodes;

import java.util.Arrays;

public class findClosestNumber {
    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for(int num : nums){
            if(Math.abs(num) < Math.abs(closest) || Math.abs(num) == Math.abs(closest) && num > closest){
                closest = num;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-1};
        System.out.println(findClosestNumber(nums));
    }
}
