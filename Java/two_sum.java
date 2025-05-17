package Leetcodes;

import java.util.*;

public class two_sum {

    public static int[] two_sum(int[] nums, int target){
        Map<Integer, Integer> hashmap = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int diff = target - nums[i];
            if (hashmap.containsKey(diff)){
                return new int[] {hashmap.get(diff), i};
            }
            hashmap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = two_sum(nums, target);
        System.out.print("[" + result[0] + ", " + result[1] + "]");
    }
}
