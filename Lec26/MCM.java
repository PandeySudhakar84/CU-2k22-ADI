package Lec26;
import java.util.Arrays;
public class MCM {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int dp[][]=new int[arr.length][arr.length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
       int ans=Cost(arr,1,arr.length-1,dp);
        System.out.println(ans);
    }
    public static int Cost(int arr[],int i,int j,int dp[][]){
      if(i>=j){
          return 0;
      }
      if(dp[i][j]!=-1){
          return dp[i][j];
      }
      int Min=Integer.MAX_VALUE;
      for(int k=i;k<=j-1;k++){
        int ans=Cost(arr,i,k,dp)+Cost(arr,k+1,j,dp)+arr[i-1]*arr[k]*arr[j];
         Min=Math.min(ans,Min);
      }
      return dp[i][j]= Min;
    }
}
