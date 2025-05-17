package Leetcodes;

public class searchInsert {
    public static int searchInsert(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == i+1 && nums[i] == target){
                return i;
            }else if(target != i+1 && i < nums[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 5));
    }
}
