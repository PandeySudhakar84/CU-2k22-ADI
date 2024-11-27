package Lec19;
public class Fibonacci_Number_TD {
    public static void main(String[] args) {
        int n=8;
        int dp[]=new int[n+1];
        int ans=fibo(n,dp);
        System.out.println(ans);
    }
        public static int fibo(int n,int dp[]){
            if(n==0 || n==1){
                return n;
            }
            if(dp[n]!=0){
                return dp[n];
            }
            dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
            return dp[n];
        }
    }