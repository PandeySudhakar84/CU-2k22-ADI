package Lec19;
public class Fibonacci_Number_BU {
    public static void main(String[] args) {
        int n=4;
        int ans= Fib(n);
        System.out.println(ans);
    }
    public static int Fib(int n) {
        int dp[]=new int[n+1];
        if(n==0 || n==1){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
