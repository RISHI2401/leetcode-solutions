package Leetcodes;

import java.util.Arrays;

public class heightChecker {
    public static int heightChecker(int[] heights){
        int res = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expected[i]){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
