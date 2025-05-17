package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class sumSubarrayMins {
    public static int sumSubarrayMins(int[] arr){
        final int mod = 1000000007;
        long sum = 0;

        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                int[] sub = findSub(arr, start, end);
                sum = (sum + findMin(sub)) % mod;
            }
        }
        return (int)sum;
    }
    private static int[] findSub(int[] arr, int start, int end) {
        int len = end - start + 1;
        int index = 0;
        int[] array = new int[len];
        while (index < len) {
            for (int i = start; i <= end; i++) {
                array[index] = arr[i];
                index++;
            }
        }
        return array;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i <= min){
                min = i;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}

//Subarrays of input {3,1,2,4} will be [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]

// min sumSubarrayMins will be 3+1+2+4+1+1+2+1+1+1 = 17