package Leetcodes;

public class MaxProductOfTwoElements {
    public static int maxProduct(int[] nums) {
        int largest = 0;
        int secondLargest = 0;
        for(int num : nums){
            if(num >= largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return (largest -1) * (secondLargest - 1);
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,2};
        System.out.println(maxProduct(array));
    }
}
