package Leetcodes;

public class maximumOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s){
        int onesCount = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                onesCount+=1;
            }
        }
        int zeroCount = s.length()-onesCount;
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("1".repeat(Math.max(0, onesCount - 1)));
        resultBuilder.append("0".repeat(zeroCount));
        resultBuilder.append("1");

        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        String s1 = "010";
        String s2 = "1010";
        System.out.println(maximumOddBinaryNumber(s1));
        System.out.println(maximumOddBinaryNumber(s2));
    }
}
