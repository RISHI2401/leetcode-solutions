package Leetcodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class element25percent {
    public static int findSpecialInteger(int[] arr) {
        int currentCount = 0;
        int maxCount = 0;
        int currentNum = arr[0];
        int ans = 0;

        for(int num : arr){
            if(num == currentNum){
                currentCount++;
                if(currentCount > maxCount){
                    maxCount = currentCount;
                    ans = num;
                }
            }else{
                currentNum = num;
                currentCount = 1;
            }
            if(maxCount > arr.length/4){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,6,6,6,6,7,7,7,7,7,7,7,7,10};
        System.out.println(findSpecialInteger(arr));
    }

}
