package Leetcodes;

//the loop-based approach has a lower overall time complexity compared to the sorting
// approach. This is especially evident when the array size (n) is large because O(n)
//is generally more efficient than O(n log n).
public class maxProductDifference {
    public static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        System.out.println(maxProductDifference(nums));
    }
}

