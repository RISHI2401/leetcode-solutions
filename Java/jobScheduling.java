package Leetcodes;

import java.util.*;

public class jobScheduling {
        public static int jobSchedulingdp(int[] startTime, int[] endTime, int[] profit) {
            int n = startTime.length;
            int[][] jobs = new int[n][3];

            for (int i = 0; i < n; i++) {
                jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
            }

            Arrays.sort(jobs, (a, b) -> a[1] - b[1]); // Sort jobs by end time

            TreeMap<Integer, Integer> dp = new TreeMap<>();
            dp.put(0, 0);

            for (int[] job : jobs) {
                int prevProfit = dp.floorEntry(job[0]).getValue();
                int maxProfit = prevProfit + job[2];
                int currentMaxProfit = dp.lastEntry().getValue();

                if (maxProfit > currentMaxProfit) {
                    dp.put(job[1], maxProfit);
                }
            }

            return dp.lastEntry().getValue();
        }
    // public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
    //     int numJobs = profit.length;
    //     Job[] jobs = new Job[numJobs];

    //     for(int i=0; i<numJobs; i++){
    //         jobs[i] = new Job(endTime[i], startTime[i], profit[i]);
    //     }

    //     Arrays.sort(jobs, Comparator.comparingInt(job -> job.endTime));
    //     int[] dp = new int[numJobs + 1];

    //     for(int i=0; i< numJobs; i++){
    //         int endTimeValue = jobs[i].endTime;
    //         int startTimeValue = jobs[i].startTime;
    //         int profitValue = jobs[i].profit;

    //         int latestNonConflictJobIndex = BinarySearch(jobs, i, startTimeValue);
    //         dp[i+1] = Math.max(dp[i], dp[latestNonConflictJobIndex] + profitValue);
    //     }
    //     return dp[numJobs];
    // }
    // private int BinarySearch(Job[] jobs, int endIndex, int targetTime){
    //     int low = 0;
    //     int high = endIndex;

    //     while(low < high){
    //         int mid = (low + high)/2;
    //         if(jobs[mid].endTime <= targetTime){
    //             low = mid+1;
    //         }else{
    //             high = mid;
    //         }
    //     }
    //     return low;
    // }

    // private static class Job{
    //     int endTime; int startTime; int profit;
    //     public Job(int endTime, int startTime, int profit){
    //         this.endTime = endTime;
    //         this.startTime = startTime;
    //         this.profit = profit;
    //     }
    // }

        public static void main(String[] args) {
            int[] startTime = {1,2,3,3};
            int[] endTime = {3,4,5,6};
            int[] profit = {50,10,40,70};
            System.out.println(jobSchedulingdp(startTime, endTime, profit));
        }
}
