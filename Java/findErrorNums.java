package Leetcodes;

import java.util.*;

public class findErrorNums {
    public static int[] findErrorNums(int[] nums){
        int expected_sum = 0;
        int actual_sum = 0;
        int n = nums.length;
        int[] ans = new int[2];

        for(int i=0; i < n; i++){
            expected_sum += i + 1;
            actual_sum += nums[i];
        }
        int difference = expected_sum - actual_sum;

        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                ans[0] = nums[i];
                ans[1] = nums[i] + difference;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        int[] ans = findErrorNums(nums);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
