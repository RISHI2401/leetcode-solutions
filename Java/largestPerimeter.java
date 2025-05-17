package Leetcodes;

import java.util.Arrays;
import java.util.Map;

public class largestPerimeter {
    public static long largestPerimeter(int[] nums){
        long sum = 0;
        Arrays.sort(nums);

        for(int num : nums){
            sum += num;
        }
        int n = nums.length;
        for(int i=n-1; i >= 2; i--){
            if( sum-nums[i] > nums[i]){
                return sum;
            }
            sum -= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,1,2,5,50,3}; // sorted would be {1,1,2,3,5,12,50}
        System.out.println(largestPerimeter(nums));
    }
}
