package Leetcodes;

public class findMin{
    public static int findMin(int[] nums){
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums= new int[]{11,13,15,17};
        System.out.println(findMin(nums));
    }
}
