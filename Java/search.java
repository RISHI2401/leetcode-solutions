public class search {
    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){ // Changed condition to handle the case when low == high
            int mid = low + (high - low) / 2; // Corrected calculation of midpoint

            if(target == nums[mid]){
                return mid;
            }

            // checking left sorted
            if(nums[low] <= nums[mid]){
                if(target > nums[mid] || target < nums[low]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else{
                // right sorted array
                if(target > nums[high] || target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
}
