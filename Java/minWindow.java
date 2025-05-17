package Leetcodes;

import java.util.HashMap;
import java.util.Map;

public class minWindow {
    public static String minWindow(String s, String t) {
        Map<Character, Integer> targetFreqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreqMap.put(c, targetFreqMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = targetFreqMap.size();
        int formedChars = 0;

        Map<Character, Integer> windowFreqMap = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreqMap.put(currentChar, windowFreqMap.getOrDefault(currentChar, 0) + 1);

            if (targetFreqMap.containsKey(currentChar) && windowFreqMap.get(currentChar).equals(targetFreqMap.get(currentChar))) {
                formedChars++;
            }

            while (left <= right && formedChars == requiredChars) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                windowFreqMap.put(leftChar, windowFreqMap.get(leftChar) - 1);

                if (targetFreqMap.containsKey(leftChar) && windowFreqMap.get(leftChar) < targetFreqMap.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
