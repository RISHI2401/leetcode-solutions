package Leetcodes;

public class maxScoreSplittingString {
    public static int maxScore(String s){
        int max = 0;
        for(int i =0; i<s.length(); i++){
            String left = s.substring(0, i+1);
            String right = s.substring(i+1, s.length());
            int leftScore = 0;
            int rightScore = 0;
            for(char c : left.toCharArray()){
                if(c == '0'){
                    leftScore += 1;
                }
            }
            for(char c : right.toCharArray()){
                if(c == '1') {
                    rightScore += 1;
                }
            }
            if(!left.isEmpty() && !right.isEmpty()){
                int score = (leftScore + rightScore);
                if( score > max){
                    max = score;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
}



//public class maxScoreSplittingString {
//    public static int maxScore(String s) {
//        int zeros = 0;
//        int ones = 0;
//        int max = 0;
//
//        for (char c : s.toCharArray()) {
//            if (c == '0') {
//                zeros += 1;
//            } else {
//                ones += 1;
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '0') {
//                zeros--;
//            } else {
//                ones--;
//            }
//            int score = zeros + ones;
//            max = Math.max(max, score);
//        }
//
//        return max;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(maxScore("011101"));
//    }
//}
