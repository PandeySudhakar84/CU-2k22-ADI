package LEC21;

import java.util.Arrays;

public class House_Robber_2 {
    class Solution {
        public int rob(int[] nums) {
            if(nums.length<2){
                return nums[0];
            }
            int first_skip[]=new int[nums.length-1];
            int last_skip[]=new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                first_skip[i]=nums[i+1];
                last_skip[i]=nums[i];
            }
            int f=rob1(first_skip);
            int s=rob1(last_skip);
            return Math.max(f,s);
        }
        public static int rob1(int nums[]){
            int dp[]=new int[nums.length+1];
            Arrays.fill(dp,-1);
            return Robber(nums,0,dp);
        }
        public static int Robber(int nums[],int i,int dp[]){
            if(i>=nums.length){
                return 0;
            }
            if(nums.length<2){
                return nums[0];
            }
            if(dp[i]!=-1){
                return dp[i];
            }
            int rob=nums[i]+Robber(nums,i+2,dp);
            int dontRob=Robber(nums,i+1,dp);
            return dp[i]=Math.max(rob,dontRob);
        }
    }
}
