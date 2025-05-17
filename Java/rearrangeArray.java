package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class rearrangeArray {
    public static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int positive_index = 0, negative_index = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                ans[positive_index++] = nums[i];
                positive_index++;

            }else{
                ans[negative_index++] = nums[i];
                negative_index++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int [] ans = rearrangeArray(nums);
        String display = "";
        for(int i : ans){
            display += i;
        }
        System.out.println(display);
    }
}
