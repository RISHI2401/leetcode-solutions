package Leetcodes;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(i, nums[i]);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){

            int key = m.getKey();
            int value = m.getValue();

            if(key > 0 && value == nums[key - 1]){
                continue;
            }
            int left = key + 1;
            int right = nums.length - 1;

            while(left < right){
                int threeSum = value + nums[left] + nums[right];

                if(threeSum > 0){
                    right -= 1;
                } else if (threeSum < 0) {
                    left += 1;
                }else{
                    result.add(Arrays.asList(value, nums[left], nums[right]));
                    left += 1;
                    while(nums[left] == nums[left - 1] && left < right){
                        left += 1;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threesum(nums));
    }
}
