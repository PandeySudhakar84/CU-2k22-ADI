package Lec6;

public class Climbing_Stairs {
    public static void main(String[] args) {
        int n=10;
        int ans=climbStairs(n);
        System.out.println(ans);
        }
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    }  
