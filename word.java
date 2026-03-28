import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class word {



    public static boolean Word(String s, List<String> worddict) {
        Set<String> set=new HashSet<>(worddict);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;


        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                if(dp[j] && set.contains(s.substring(j,i))) {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(Word("leetcode", Arrays.asList("leet","code")));
        
    }
    
}
