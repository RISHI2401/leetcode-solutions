package Leetcodes;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class containsDuplicates {

    public static boolean containsDuplicat(int[] nums) {      // debug later : spelling

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.values()){
            if(i > 1){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
            return false;
    }

    public static void main(String[] args) {
     int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
     System.out.println(containsDuplicate(nums));
    }
}
