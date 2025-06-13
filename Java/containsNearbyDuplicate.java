import java.util.HashMap;

public class containsNearbyDuplicate {
    public static Boolean ContainsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index<nums.length; index++){
            int num = nums[index];

            if (map.containsKey(num) && (index - map.get(num)) <= k) {
                return true;
            }else{
                map.put(num, index);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(ContainsNearbyDuplicate(nums, k));
    }
}
