package Leetcodes;

public class minimumLength {
    public static int minimumLength(String s){
        int leftPointer = 0;
        int rightPointer = s.length()-1;

        while(leftPointer < rightPointer && s.charAt(leftPointer) == s.charAt(rightPointer)){
            char currentChar = s.charAt(leftPointer);

            //Moving left pointer to the right until a different character is found
            while(leftPointer <= rightPointer && s.charAt(leftPointer) == currentChar){
                leftPointer++;
            }
            //Moving right pointer to the left until a different character is found
            while(rightPointer >= leftPointer && s.charAt(rightPointer) == currentChar){
                rightPointer--;
            }
        }
        return rightPointer-leftPointer+1;
    }

    public static void main(String[] args) {
        String s1 = "ca";
        String s2 = "cabaabac";
        String s3 = "aabccabba";
        System.out.println(minimumLength(s1));
        System.out.println(minimumLength(s2));
        System.out.println(minimumLength(s3));
    }
}
