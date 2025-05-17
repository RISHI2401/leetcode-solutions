package Leetcodes;

import java.util.Arrays;
import java.util.Comparator;

public class maxWidthOfVerticalArea {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int length = points.length;
        int[] arrayX = new int[length];
        for(int i=0; i<length; i++){
            arrayX[i] = points[i][0];
        }
        Arrays.sort(arrayX);
        int max = 0;
        for(int j=1; j<length; j++){
            int diff = arrayX[j] - arrayX[j-1];
            max = Math.max(max, diff);
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] points = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
