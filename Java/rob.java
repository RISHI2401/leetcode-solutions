package Leetcodes;

public class rob {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        // Rob the first house and exclude the last
        int robFirst = robHelper(nums, 0, nums.length - 2);

        // Exclude the first house and rob the last
        int robLast = robHelper(nums, 1, nums.length - 1);

        // Return the maximum of the two scenarios
        return Math.max(robFirst, robLast);
    }

    private static int robHelper(int[] nums, int start, int end) {
        int prevMax = 0;
        int currMax = 0;

        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }

        return currMax;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
}
