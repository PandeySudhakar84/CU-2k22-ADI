package LEC20;

import java.util.Arrays;
public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int arr[]={10,15,20};
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int Zeeroth=MinCost(arr,0,dp);
        int fSt=MinCost(arr,1,dp);
        int ans=Math.min(Zeeroth,fSt);
        System.out.println(ans);
    }
    public static int MinCost(int arr[],int i,int dp[]){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
       int f= MinCost(arr,i+1,dp);
        int s=MinCost(arr, i+2,dp);
        return dp[i]=Math.min(f,s)+arr[i];
    }
}
