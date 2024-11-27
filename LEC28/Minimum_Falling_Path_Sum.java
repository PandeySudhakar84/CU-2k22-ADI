package LEC28;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
    class Solution {
        public int minFallingPathSum(int[][] matrix) {
            int ans=Integer.MAX_VALUE;
            int dp[][]=new int[matrix.length][matrix[0].length];
            for(int a[]:dp){
                Arrays.fill(a,Integer.MIN_VALUE);
            }
            for(int i=0;i<matrix[0].length;i++){
                ans=Math.min(Path(matrix,0,i,dp),ans);
            }
            return ans;
        }
        public static int Path(int arr[][],int r,int c,int dp[][]){
            if(c<0 || c>=arr[0].length){
                return Integer.MAX_VALUE;
            }
            if(r==arr.length-1){
                return arr[r][c];
            }
            if(dp[r][c]!=Integer.MIN_VALUE){
                return dp[r][c];
            }
            int LD=Path(arr,r+1,c-1,dp);
            int SC=Path(arr,r+1,c,dp);
            int RD=Path(arr,r+1,c+1,dp);
            return dp[r][c]=Math.min(LD,Math.min(SC,RD))+arr[r][c];
        }
    }
}
