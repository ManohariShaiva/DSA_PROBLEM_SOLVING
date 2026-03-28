public class Subscription {
    public static int longestWindow(int[] days, int k) {
        int left=0;
        int max=0;
        for(int right=0;right<days.length;right++) {
            while(days[right]-days[left]>k) {
                left++;
            }
            max=Math.max(max,right-left+1);

        }
        return max;
    }
    public static void main(String[] args) {
        int[] days = {1,3,5,7,9};
        int k=4;
        System.err.println(longestWindow(days, k));        
    }
}