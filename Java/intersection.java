package Leetcodes;

import java.util.HashSet;
import java.util.Set;

public class intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums2) {
            set.add(i);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int i : nums1) {
            if (set.contains(i)) {
                resultSet.add(i);
            }
        }

        int[] resultArray = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            resultArray[index++] = num;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

