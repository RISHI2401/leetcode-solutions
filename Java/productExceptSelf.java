package Leetcodes;

public class productExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        for(int i=1; i<nums.length; i++){
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }
        int suffixProduct = 1;
        for(int i=nums.length-1; i>=0; i--){
            prefixProduct[i] = prefixProduct[i] * suffixProduct;
            suffixProduct =  suffixProduct * nums[i];
        }
        return prefixProduct;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] ans = productExceptSelf(nums1);
        for(int i : ans){
            System.out.print(i + " : ");
        }
    }
}