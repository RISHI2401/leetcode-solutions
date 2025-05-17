package Leetcodes;

//Sieve of Eratosthenes algorithm

public class countPrimes {
    public static int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) { //i*i is nothing but square root
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5000000;
        System.out.println(countPrimes(n));
    }
}





/*

import java.util.ArrayList;
import java.util.List;

public class countPrimes {
    public static int countPrimes(int n){
        if(n <= 1){
            return 0;
        }

        List<Integer> list = new ArrayList<>();

        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list.size();
    }
    private static boolean isPrime(int n){

        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5000000;
        System.out.println(countPrimes(n));
    }
}

 */
