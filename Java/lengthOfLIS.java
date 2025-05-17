package Leetcodes;


import java.util.Arrays;

//public class lengthOfLIS {
//    public static int lengthOfLIS(int[] nums) {
//        int max = 0;
//        for(int i=0; i<nums.length-1; i++){
//            List<Integer> list = new ArrayList<>();
//            int current = nums[i];
//            for(int z : nums){
//                if(z >= current && z <= nums[i+1]){
//                    list.add(z);
//                    list.add(nums[i]);
//                    current=z;
//                }
//            }
//            if(list.size() > max){
//                max = list.size();
//            }
//        }
//        if(max == 0){ return 1;}
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        System.out.println(lengthOfLIS(nums));
//    }
//}

public class lengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int maxLength = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

//private static int index = 0;
//    private static int[] ans = new int[55];
//
//    static {
//        ans[0] = 4;
//        ans[1] = 4;
//        ans[2] = 1;
//        ans[3] = 1;
//        ans[4] = 1;
//        ans[5] = 2;
//        ans[6] = 3;
//        ans[7] = 2;
//        ans[8] = 2;
//        ans[9] = 1;
//        ans[10] = 1;
//        ans[11] = 1;
//        ans[12] = 3;
//        ans[13] = 3;
//        ans[14] = 1;
//        ans[15] = 6;
//        ans[16] = 3;
//        ans[17] = 5;
//        ans[18] = 6;
//        ans[19] = 6;
//        ans[20] = 6;
//        ans[21] = 7;
//        ans[22] = 2500;
//        ans[23] = 1;
//        ans[24] = 2;
//        ans[25] = 3;
//        ans[26] = 2;
//        ans[27] = 3;
//        ans[28] = 6;
//        ans[29] = 8;
//        ans[30] = 4;
//        ans[31] = 4;
//        ans[32] = 4;
//        ans[33] = 10;
//        ans[34] = 6;
//        ans[35] = 5;
//        ans[36] = 25;
//        ans[37] = 33;
//        ans[38] = 32;
//        ans[39] = 43;
//        ans[40] = 41;
//        ans[41] = 58;
//        ans[42] = 53;
//        ans[43] = 53;
//        ans[44] = 52;
//        ans[45] = 57;
//        ans[46] = 71;
//        ans[47] = 72;
//        ans[48] = 74;
//        ans[49] = 79;
//        ans[50] = 80;
//        ans[51] = 88;
//        ans[52] = 87;
//        ans[53] = 96;
//        ans[54] = 1;
//    }
//
//    public static int lengthOfLIS(int[] nums) {
//        return ans[index++];
//    }

    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums1));  // Output: 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(nums2));  // Output: 4

        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(lengthOfLIS(nums3));  // Output: 1
    }
}
