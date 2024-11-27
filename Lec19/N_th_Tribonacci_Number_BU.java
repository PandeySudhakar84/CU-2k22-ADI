package Lec19;
public class N_th_Tribonacci_Number_BU {
    public static void main(String[] args) {
        int n=25;
       int ans= tribonacci(n);
        System.out.println(ans);
    }
    public static int tribonacci(int n) {
        int dp[]=new int[n+1];
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
