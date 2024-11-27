package LEC22;
import java.util.Arrays;
public class Uncrossed_Lines {
    class Solution {
        public int maxUncrossedLines(int[] nums1, int[] nums2) {
            int dp[][]=new int[nums1.length+1][nums2.length+1];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return Uncrosed(nums1,nums2,0,0,dp);
        }
        public static int Uncrosed(int nums1[],int nums2[],int i,int j,int dp[][]){
            if(i==nums1.length || j==nums2.length){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int ans=0;
            if(nums1[i]==nums2[j]){
                ans=1+Uncrosed(nums1,nums2,i+1,j+1,dp);
            }
            else{
                int f=Uncrosed(nums1,nums2,i+1,j,dp);
                int s=Uncrosed(nums1,nums2,i,j+1,dp);
                ans=Math.max(f,s);
            }
            return dp[i][j]=ans;
        }
    }
}
