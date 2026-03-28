public class leafvalues {
    public static int mct(int[] arr) {
        int n=arr.length;
        int[][] dp=new int[n][n];
        int[][] max=new int[n][n];
        for(int i=0;i<n;i++) {
            max[i][j]=arr[i];
            for( int j=i+1;j<n;j++) {
                max[i][j]=Math.max(max[i][j-1],arr[j]);
            }
        }
        for(int len=2;len<=n;len++) {
            for(int i=0;i<=n-len;i++) {
                int j=i+len-i;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++) {
                    dp[i][j]=Math.min(dp[i][j], dp[i][k]+ dp[k+1][j]+ max[i][k]*max[k+1][j]) ;
                }
            }
        }
        return dp[0][n-1];

    }
    public static void main(String[] args) {
        int[] arr={6,2,4};
        System.out.println(mct(arr));
        
    }
}
