package Leetcodes;

import java.util.*;

public class getCommon {
    public static int getCommon(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        int min = Integer.MAX_VALUE;

        for(int i : nums2){
            if(set.contains(i)){
                min = Math.min(i, min);
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,6};
        System.out.println(getCommon(nums1, nums2));
    }
}
