package LEC28;

import java.util.Arrays;

public class Minimum_Path_Sum {
    class Solution {
        public int minPathSum(int[][] grid) {
            int dp[][]=new int[grid.length][grid[0].length];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return Path(grid,0,0,dp);
        }
        public static int Path(int arr[][],int r,int c,int dp[][]){
            if(r>=arr.length || c>=arr[0].length){
                return Integer.MAX_VALUE;
            }
            if(r==arr.length-1 && c==arr[0].length-1){
                return arr[r][c];
            }
            if(dp[r][c]!=-1){
                return dp[r][c];
            }
            int right=Path(arr,r,c+1,dp);
            int down=Path(arr,r+1,c,dp);
            return dp[r][c]=Math.min(right,down)+arr[r][c];
        }
    }
}
