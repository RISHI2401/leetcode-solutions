package Leetcodes;

public class MIN_Rotated_Sorted_Array {
    public static int findMin(int[] nums) {
        int low = 0; int high = nums.length - 1; //pointers
        //if the array is sorted
        if(nums[low] <= nums[high]){
            return nums[low];
        }

        //if not sorted then use binary search algorith
        while(low <= high){
            int mid = (low + high) / 2;
            int mid_element = nums[mid];

            if(mid == 0){
                return Math.min(mid_element, nums[mid + 1]);
            }
            if(mid_element < nums[mid - 1]){
                return mid_element;
            }
            if(mid_element < nums[high]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(findMin(nums));
    }
}
