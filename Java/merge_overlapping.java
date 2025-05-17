package Leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_overlapping {
    public static int[][] merge_overlapping(int[][] nums){
        if(nums.length == 0) return new int[0][];

        Arrays.sort( nums, (a, b) -> Integer.compare(a[0], b[0]) );

        List<int[]> result = new ArrayList<>();

        int[] currentInterval = nums[0];
        result.add(currentInterval);

        for(int i=1; i<nums.length; i++){
            int[] current = result.get(result.size() - 1);
            int[] next = nums[i];

            if(current[1] >= next[0]){ //that means overlapping
                current[1] = Math.max(current[1], next[1]);
            }else{
                result.add(next);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge_overlapping(nums);
        for (int[] i : ans){
            System.out.println(i[0] + ", " + i[1]);
        }
    }
}
