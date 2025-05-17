package Leetcodes;

public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        // checking if a number is a power of 2
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(8));
    }
}
