import java.util.Arrays;

public class job {
    static class Scheduling {
        int start, end, profit;
        Job(int start, int end, int profit) {
            this.start=start;
            this.end=end;
            this.profit=profit;
        }
    }
    public static jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        Job[] jobs=new Job[n];
            for(int i=0;i<n;i++) {
                jobs[i]=new Job(startTime[i], endTime[i],profit[i]);
            }
            Arrays.sort(jobs,(a,b)->a.end-b.end);
            int[] dp=new int[n];
            dp[0]=jobs.profit;


            for(int i=1;i<n;i++) {
                int includeProfir=jobs[i].profit;
            }



            return dp[n-1];


    }


    public static void main(String[] args) {
        int[] startTime={1,2,3,3},
         endTime={3,4,5,6},
       profit={50,10,40,70};
        int[] startTime1={1,2,3,4,6}, endTime2={3,5,10,6,9}, profit3={20,20,100,70,60};
        System.out.println(jobScheduling(startTime, endTime, profit));
        System.out.println(jobScheduling(startTime1, endTime2, profit3));


    }
}
