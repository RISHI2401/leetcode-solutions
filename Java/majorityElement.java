package Leetcodes;

import java.util.*;

public class majorityElement {
    public static int majorityElement(int[] nums) {
// WAY 1 Using Mapping:

//        Map<Integer, Integer> intCount = new HashMap<>();
//
//        for (int num : nums) {
//            intCount.put(num, intCount.getOrDefault(num, 0) + 1);
//        }
//
//        int max = 0;
//        int ans = 0;
//
//        for (Map.Entry<Integer, Integer> map : intCount.entrySet()) {
//            if (map.getValue() > max) {
//                max = map.getValue();
//                ans = map.getKey();
//            }
//        }
//
//        if (max > nums.length / 2) {
//            return ans;
//        }
//        return 0;
//    }

//WAY 2  Using Boyer-Moore Voting Algorithm:

        int candidate = nums[0];
        int count = 1;

//        for(int num : nums){
//            if(num == candidate){
//                count++;
//            }else if(count  > 0){
//                count --;
//            }else{
//                candidate = num;
//                count = 1;
//            }
//        }
//        count = 0;
//        for(int num : nums){
//            if(num == candidate){
//                count++;
//            }
//        }
//        return (count > nums.length/2 ? candidate : 0);

        for(int num : nums){
            if(num == candidate){
                count++;
            }else {
                count--;
            }
            if (count == 0){
                candidate = num;
                count = 1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
