package LEC27;

import java.util.Arrays;

public class Palindrome_Partitioning_II {
    class Solution {
        public int minCut(String s) {
            int dp[][]=new int[s.length()][s.length()];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return Partition(s,0,s.length()-1,dp);
        }
        public static int Partition(String s,int i,int j,int dp[][]){
            if(i>j){
                return 0;
            }
            if(Ispalindrome(s,i,j)){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int min=Integer.MAX_VALUE;
            for(int k=i;k<j;k++){
                if(Ispalindrome(s,i,k)){
                    int ans=1+Partition(s,k+1,j,dp);
                    min=Math.min(ans,min);
                }
            }
            return dp[i][j]=min;
        }
        public static boolean Ispalindrome(String s,int i,int j){
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}
