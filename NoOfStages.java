import java.util.*;
public class NoOfStages {

    public static int minStages(int[][] intervals) {
        if(intervals.length==0) {
            return 0;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<> ();
        pq.add(intervals[0][1]);  //11

        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0]>=pq.peek()) {
                pq.poll();
            }
            pq.add(intervals[i][1]);
        }
        return pq.size();

    }
    public static void main(String [] args) {
        int [][] intervals = {{7,11},{0,5}};
        System.out.println(minStages(intervals));


    }
}