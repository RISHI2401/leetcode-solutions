package Leetcodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findMatrix {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        while(nums.length > 0) {
            Set<Integer> set = new HashSet<>();
            List<Integer> list = new ArrayList<>(set);
            for(int num : nums){
                if(!set.contains(num)){
                    set.add(num);
                    list.add(num);
                }
            }
            for(int num : set){
                int index = indexOf(nums, num);
                if(index != -1){
                    nums = removeElement(nums, index);
                }
            }
            answer.add(list);
        }
        return answer;
    }
    private static int indexOf(int[] array, int target){
        for(int i=0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    private static int[] removeElement(int[] array, int index){
        int[] result = new int[array.length-1];
        //copying elements before the index
        System.arraycopy(array, 0, result,0, index);
        //copying elements after the index
        System.arraycopy(array, index+1, result, index, array.length-index-1);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
}
