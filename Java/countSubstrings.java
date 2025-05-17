package Leetcodes;

public class countSubstrings {
    public static int countSubstrings(String s) {
        int count = 0;

        // Iterate through all possible centers of palindromes
        for (int center = 0; center < 2 * s.length() - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            // Expand around the center to find palindromes
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(countSubstrings(s));
    }
}
