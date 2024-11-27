package Lec19;
public class N_th_Tribonacci_Number_TD {
    public static void main(String[] args) {
        int n=25;
        int dp[]=new int[n+1];
        int ans=tri(n,dp);
        System.out.println(ans);
    }
    public static int tri(int n,int dp[]){
        if(n<2){
            return n;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=tri(n-1,dp)+tri(n-2,dp)+tri(n-3,dp);
        return dp[n];
    }
}
