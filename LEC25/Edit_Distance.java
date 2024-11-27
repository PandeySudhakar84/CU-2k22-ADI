package LEC25;

import java.util.Arrays;

public class Edit_Distance {
    class Solution {
        public int minDistance(String word1, String word2) {
            int dp[][]=new int[word1.length()][word2.length()];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return Distance(word1,word2,0,0,dp);
        }
        public static int Distance(String s1,String s2,int i,int j,int dp[][]){
            if(i==s1.length()){
                return s2.length()-j;
            }
            if(j==s2.length()){
                return s1.length()-i;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int ans=0;
            if(s1.charAt(i)==s2.charAt(j)){
                ans=Distance(s1,s2,i+1,j+1,dp);
            }
            else{
                int D=Distance(s1,s2,i+1,j,dp);
                int I=Distance(s1,s2,i,j+1,dp);
                int R=Distance(s1,s2,i+1,j+1,dp);
                ans=1+Math.min(D,Math.min(I,R));
            }
            return dp[i][j]=ans;
        }
    }
}
