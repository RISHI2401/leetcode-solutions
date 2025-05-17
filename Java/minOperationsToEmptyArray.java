import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minOperationsToEmptyArray {
//    public static int minOperations(int[] nums) {
//        int count = 0;
//        List<Integer> list = new ArrayList<>();
//        int loop = nums.length;
//        while (loop > 0) {
//            for (int i = 0; i < nums.length; i++) {
//                int current = nums[i];
//                int[] indices = index(nums, current);
//
//                if (indices.length % 2 == 0) {
//                    nums = removeTwoElements(nums, indices);
//                    count++;
//                    loop -= indices.length;
//                } else if (indices.length == 1) {
//                    return -1;
//                } else {
//                    nums = removeThreeElements(nums, indices);
//                    count++;
//                    loop -= indices.length;
//                }
//            }
//        }
//        return count;
//    }
//
//    private static int[] removeThreeElements(int[] nums, int[] indices) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean shouldRemove = false;
//            for (int j : indices) {
//                if (i == j) {
//                    shouldRemove = true;
//                    break;
//                }
//            }
//            if (!shouldRemove) {
//                result.add(nums[i]);
//            }
//        }
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    private static int[] removeTwoElements(int[] nums, int[] indices) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean shouldRemove = false;
//            for (int j : indices) {
//                if (i == j) {
//                    shouldRemove = true;
//                    break;
//                }
//            }
//            if (!shouldRemove) {
//                result.add(nums[i]);
//            }
//        }
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    private static int[] index(int[] nums, int target) {
//        List<Integer> indices = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                indices.add(i);
//            }
//        }
//        return indices.stream().mapToInt(Integer::intValue).toArray();
//    }
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count,min=0,current;
        for(int i=0;i<nums.length;i++){
            current=nums[i];
            count=0;
            while(i<nums.length && current==nums[i]){
                count+=1;
                i++;
            }
            if(count==1)return -1;
            min+= Math.ceil(count/(3*1.0));
            i--;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        System.out.println(minOperations(nums));
    }
}
