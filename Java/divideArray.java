package Leetcodes;

import Adapter_Pattern.IStack;

import java.util.*;

public class divideArray {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i+=3){
            if(Math.abs(nums[i] - nums[i+2]) > k) {
                return new int[0][];
            } else {
                ans.add(new int[]{nums[i], nums[i+1], nums[i+2]});
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,4,8,7,9,3,5,1};
        int[] nums2 = {1,3,3,2,7,3};

        int[][] ans1 = divideArray(nums1, 2);
        int[][] ans2 = divideArray(nums2, 3);

        for(int[] sub : ans1){
            System.out.print(Arrays.toString(sub) + ", ");
        }
        for(int[] sub : ans2){
            System.out.println(Arrays.toString(sub) + " : ");
        }
    }
}

/*
# Python Code

class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        result = []
        is_possible = True
        for i in range(0, len(nums)-2, 3):
            first, second, third = nums[i], nums[i+1], nums[i+2]
            if third-first <= k:
                result.append([first, second, third])
            else:
                is_possible=False
                break
        if not is_possible:
            return []
        return result


 */
