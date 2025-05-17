package Leetcodes;

public class rangeBitwiseAnd {
    public static int rangeBitwiseAnd(int left, int right){
        if(!(0 <= left || left <= right)){
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
        System.out.println(rangeBitwiseAnd(0,0));
        System.out.println(rangeBitwiseAnd(0, 2147483647));

        int a = 0, b = 1;
        int result = a & b;
        System.out.println(result);
    }
}
