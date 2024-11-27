package LEC27;

import java.util.Arrays;

public class Burst_Balloons {
    class Solution {
        static int dp[][]=new int[301][301];
        public int maxCoins(int[] nums) {
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return Cost(nums,0,nums.length-1);
        }
        public static int Cost(int nums[],int i,int j){
            if(i>j){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int Max=Integer.MIN_VALUE;
            for(int k=i;k<=j;k++){
                int left=(i>0?nums[i-1]:1);
                int right=(j<nums.length-1?nums[j+1]:1);
                int ans=Cost(nums,i,k-1)+Cost(nums,k+1,j)+left*nums[k]*right;
                Max=Math.max(Max,ans);
            }
            return dp[i][j]=Max;
        }
    }
}
