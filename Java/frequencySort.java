package Leetcodes;

import java.util.*;

public class frequencySort {
    public static String frequencySort(String s){

        Map<Character,Integer> map = new TreeMap<>();
        //Adding values to the map with their frequencies
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //Using Priority Queue with a custom comparator
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        //add character to the priority queue based on their frequencies
        pq.addAll(map.entrySet());

        //Building the result string
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
}
