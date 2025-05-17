package Leetcodes;

import java.util.HashMap;
import java.util.Map;

public class maxFrequencyElements {
    public static  int maxFrequencyElements(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i , 0) + 1);
        }
        int maxFreq = 0;
        for(int i : map.values()){
            if(i >= maxFreq){
                maxFreq = i;
            }
        }
        int count = 0;
        for(int i : map.keySet()){
            if(map.get(i) == maxFreq){
                count+=maxFreq;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        int[] nums2 = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(nums));
        System.out.println(maxFrequencyElements(nums2));
    }
}
