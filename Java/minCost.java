package Leetcodes;

public class minCost {
    public static int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int i = 0, j = 0;

        while (i < neededTime.length && j < neededTime.length) {
            int currTotal = 0, currMax = 0;

            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                currTotal += neededTime[j];
                currMax = Math.max(currMax, neededTime[j]);
                j++;
            }

            totalTime += currTotal - currMax;
            i = j;
        }
        return totalTime;
    }


    public static void main(String[] args) {
        int[] neededTime = {1,2,3,4,1};
        String colors = "abaac";
        System.out.println(minCost(colors, neededTime));
    }
}
//    public static int minCost(String colors, int[] neededTime) {
//        int sum=0;
//        StringBuilder indices = new StringBuilder(colors);
//        for(int i=1; i<colors.length(); i++){
//            if(colors.charAt(i) == colors.charAt(i-1)){
//                sum += Math.min(neededTime[i], neededTime[i-1]);
//            }
//        }
//        return sum;
