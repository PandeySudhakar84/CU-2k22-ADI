package LEC28;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II{
    class Solution {
        public int minFallingPathSum(int[][] grid) {
            int dp[][]=new int[grid.length][grid[0].length];
            for(int a[]:dp){
                Arrays.fill(a,Integer.MIN_VALUE);
            }
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<grid[0].length;i++){
                ans=Math.min(Path(grid,0,i,dp),ans);
            }
            return ans;
        }
        public static int Path(int grid[][],int r,int c,int dp[][]){
            if(r==grid.length-1){
                return grid[r][c];
            }
            if(dp[r][c]!=Integer.MIN_VALUE){
                return dp[r][c];
            }
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<grid[0].length;i++){
                if(c!=i){
                    ans=Math.min(ans,Path(grid,r+1,i,dp));
                }
            }
            return dp[r][c]=ans+grid[r][c];
        }
    }
}
