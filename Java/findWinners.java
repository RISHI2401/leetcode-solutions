package Leetcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class findWinners {
    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> looserMap = new TreeMap<>();
        Map<Integer, Integer> winnerMap = new TreeMap<>();

        for(int[] match : matches){

            int winner = match[0];
            int looser = match[1];

            looserMap.put(looser, looserMap.getOrDefault(looser, 0)+1);
            winnerMap.put(winner, winnerMap.getOrDefault(winner, 0)+1);

        }

        List<Integer> winners = new ArrayList<>();
        List<Integer> loosers = new ArrayList<>();

//        condition 1
        for(int winner : winnerMap.keySet()){
            if(!looserMap.containsKey(winner)){
                winners.add(winner);
            }
        }
//        condition 2
        for(int looser : looserMap.keySet()){
            if(looserMap.get(looser) == 1){
                loosers.add(looser);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(winners);
        ans.add(loosers);

        return ans;

    }

    public static void main(String[] args) {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(findWinners(matches));
    }
}
