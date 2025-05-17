package Leetcodes;

//class LongestPaland_SubString {
//    public static String longestPalindrome(String s) {
//        int n = s.length();
//        boolean[][] dp = new boolean[n][n];
//        int maxLength = 1;
//        int start = 0;
//
//        // All substrings of length 1 are palindromes
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = true;
//        }
//
//        // Check palindromes of length 2
//        for (int i = 0; i < n - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) {
//                dp[i][i + 1] = true;
//                start = i;
//                maxLength = 2;
//            }
//        }
//
//        // Check palindromes of length 3 or more
//        for (int len = 3; len <= n; len++) {
//            for (int i = 0; i <= n - len; i++) {
//                int j = i + len - 1;
//                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
//                    dp[i][j] = true;
//                    start = i;
//                    maxLength = len;
//                }
//            }
//        }
//
//        return s.substring(start, start + maxLength);
//    }
//
//    public static void main(String[] args) {
//        String s = "abaabjds";
//        String ans = longestPalindrome(s);
//        System.out.println(ans);
//    }
//}

                                    //OR

class LongestPaland_SubString{
    //check palindrome string/substring
    public static String expandFromCentre(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }
        return s.substring(left + 1, right);
    }
    public static String longestPalindrome(String s){
        String ans = "";
        for(int i=0; i<s.length(); i++){
            String s1 = expandFromCentre(s, i, i);
            String s2 = expandFromCentre(s, i, i+1);

            if(ans.length() < s1.length()){ ans = s1; }
            if(ans.length() < s2.length()){ ans = s2; }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abaabjds";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
}

