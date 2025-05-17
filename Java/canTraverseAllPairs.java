package Leetcodes;

import java.util.*;

public class canTraverseAllPairs {
    public boolean canTraverseAllPairs(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        if (numSet.contains(1)) {
            return false;
        }

        if (numSet.size() == 1) {
            return true;
        }

        List<Integer> sortedNums = new ArrayList<>(numSet);
        Collections.sort(sortedNums, Collections.reverseOrder());

        for (int i = 0; i < sortedNums.size() - 1; i++) {
            for (int j = i + 1; j < sortedNums.size(); j++) {
                if (gcd(sortedNums.get(i), sortedNums.get(j)) - 1 != 0) {
                    sortedNums.set(j, sortedNums.get(j) * sortedNums.get(i));
                    break;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        canTraverseAllPairs solution = new canTraverseAllPairs();
        int[] nums = {2,3,6};
        System.out.println(solution.canTraverseAllPairs(nums));
    }
}

