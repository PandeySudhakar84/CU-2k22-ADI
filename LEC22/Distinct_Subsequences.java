package LEC22;

import java.util.Arrays;

public class Distinct_Subsequences {
    class Solution {
        public int numDistinct(String s, String t) {
            int dp[][]=new int[s.length()][t.length()];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return SubSet(s,t,0,0,dp);
        }
        // s--> arr
        // t-->sum
        public static int SubSet(String s,String t,int i,int j,int dp[][]){
            if(j==t.length()){
                return 1;
            }
            if(i==s.length()){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int pick=0;
            int not_pick=0;
            if(s.charAt(i)==t.charAt(j)){
                pick=SubSet(s,t,i+1,j+1,dp);
            }
            not_pick=SubSet(s,t,i+1,j,dp);
            return dp[i][j]=pick+not_pick;
        }
    }
}
