package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class findJudge {
    public static int findJudge(int n, int[][] trusts){
        // so if we use in degree and out degree concept, we can keep track of everyone with their in-degrees(how many people
        // trust them) and out-degrees(how many they trust) so that in the end the person with the in-degree 'n-1' (since
        // everybody excepts the judge trusts them) and out-degree '0' (since the judge trusts nobody) is the judge aka our answer.

        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n+1];

        for(int[] trust : trusts){
            outDegree[trust[0]] += 1;
            inDegree[trust[1]] += 1;
        }

        for(int i = 0; i < n+1; i++){
            if(inDegree[i] == n-1 && outDegree[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] trusts = {{1,3}, {2,3}};
        int[][] trusts2 = {{1,3},{2,3},{3,1}};
        System.out.println(findJudge(n, trusts));
        System.out.println(findJudge(3, trusts2));
    }
}
