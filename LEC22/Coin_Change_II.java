package LEC22;

import java.util.Arrays;

public class Coin_Change_II {
    class Solution {
        public int change(int amount, int[] coins) {
            int dp[][]=new int[amount+1][coins.length];
            for(int a[]:dp){
                Arrays.fill(a,-1);
            }
            return Coin(amount,coins,0,dp);
        }
        public static int Coin(int amount,int coins[],int i,int dp[][]){
            if(amount==0){
                return 1;
            }
            if(i==coins.length){
                return 0;
            }
            if(dp[amount][i]!=-1){
                return dp[amount][i];
            }
            int pick=0;
            int dontpick=0;
            if(amount>=coins[i]){
                pick=Coin(amount-coins[i],coins,i,dp);
            }
            dontpick=Coin(amount,coins,i+1,dp);
            return dp[amount][i]=pick+dontpick;
        }
    }
}
