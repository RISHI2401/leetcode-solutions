package Leetcodes;

import java.util.Arrays;

public class eraseOverlapIntervals {
    public static int eraseOverlapIntervals(int[][] intervals){
        if(intervals.length == 0) return 0;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int[] current = intervals[0];
        for(int i=1; i<intervals.length; i++){
            int[] next = intervals[i];

            if(current[1] > next[0]){
                count++;
            }else{
                current = next;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
