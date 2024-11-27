package LEC20;
import java.util.Arrays;
public class House_RobberTD {
    class Solution {
        public int rob(int[] nums) {
            int n=nums.length;
            int dp[]=new int[n];
            Arrays.fill(dp,-1);
            return Robber(nums,0,dp);
        }
        public static int Robber(int nums[],int index,int dp[]){
            if(index>=nums.length){
                return 0;
            }
            if(dp[index]!=-1){
                return dp[index];
            }
            int rob=nums[index]+Robber(nums,index+2,dp);
            int DontRob=Robber(nums,index+1,dp);
            return dp[index]=Math.max(rob,DontRob);
        }
    }
}
