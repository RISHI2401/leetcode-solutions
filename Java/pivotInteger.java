package Leetcodes;

public class pivotInteger {
    public static int pivotInteger(int n){
        int totalSum = n * (n+1) / 2;
        double a = Math.sqrt(totalSum);
        return (a - Math.ceil(a) == 0) ? (int)a : -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
        System.out.println(pivotInteger(1));
        System.out.println(pivotInteger(4));
    }
}
