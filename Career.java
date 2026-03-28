public class Career {
        public static int longestIncreasingStreak(int[] salaries) {
            int n=salaries.length;
            if(n==0) {
                return 0;
            }

            int[] dp=new int[n];
            for(int i=0;i<n;i++) {
                dp[i]=1;
            }

            for(int i=1;i<n;i++) {
                for(int j=0;j<i;j++) {
                    if(salaries[j]<salaries[i]) {
                        dp[i]=Math.max(dp[i], dp[j]+1);

                    }
                }
            }

            int max=0;
            for(int val:dp) {
                max=Math.max(max,val);
            }
            return max;

        }
    
    public static void main(String[] args) {
        int[] salaries={10,9,2,5,7,101,18};
        System.out.println(Career.longestIncreasingStreak(salaries));

    }
}
