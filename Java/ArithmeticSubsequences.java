package Leetcodes;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticSubsequences {

    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int total_count = 0;

        // Initialize an array of HashMaps to store counts of subsequences for each index
        Map<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        // Iterate over each index i
        for (int i = 0; i < n; i++) {
            // Iterate over all indices j before i
            for (int j = 0; j < i; j++) {
                // Calculate the common difference
                int diff = nums[i] - nums[j];

                // Update the count for index i with common difference diff
                dp[i].put(diff, dp[i].getOrDefault(diff, 0) + dp[j].getOrDefault(diff, 0) + 1);

                // Update the total count with the count for index j and common difference diff
                total_count += dp[j].getOrDefault(diff, 0);
            }
        }

        return total_count;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 6, 8, 10};
        System.out.println(numberOfArithmeticSlices(nums1));  // Output: 7

        int[] nums2 = {7, 7, 7, 7, 7};
        System.out.println(numberOfArithmeticSlices(nums2));  // Output: 16
    }
}
