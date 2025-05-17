package Leetcodes;

import java.util.Arrays;

public class merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        while (j < nums2.length) {
            for(int i = nums1.length-nums2.length; i<nums1.length; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        for (int i: nums1){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
