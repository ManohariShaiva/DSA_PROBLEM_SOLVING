public class banana {
    public static int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles) {
            right=Math.max(right,pile);
        }
        int answer=right;
        while(left<=right) {
            int mid=left+(right-left)/2;
            int totalhours=0;

            for(int pile:piles) {
                totalhours+=(pile+mid-1)/mid;
            }
            if(totalhours <=h) {
                answer=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return answer;

    }
    public static void main(String[] args) {
       int[] piles={3,6,7,11};
    }
    
}
