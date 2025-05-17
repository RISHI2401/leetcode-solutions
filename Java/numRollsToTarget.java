package Leetcodes;

public class numRollsToTarget {
    public static int numRollsToTarget(int n, int k, int target) {
        int MOD = 1000000007;
        int[][]  dp = new int[n+1][target+1];
        //Base Case
        dp[0][0] = 1;
        //Dp calculation
        for(int i=1; i<=n; i++){
            for(int j=1; j<=target; j++){
                for(int face = 1; face <= k; face++){
                    if(j>=face){
                        dp[i][j] = (dp[i][j] + dp[i-1][j-face]) % MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30,30,500));
    }
}
