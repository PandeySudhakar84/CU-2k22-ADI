package LEC21;

import java.util.Arrays;

public class Coin_Change {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int dp[] = new int[amount + 1];
            Arrays.fill(dp, amount + 1); // Initialize with amount + 1 which is greater than any possible coin combination
            dp[0] = 0; // Base case: 0 amount needs 0 coins
            for (int i = 1; i <= amount; i++) {
                for (int coin : coins) {
                    if (i >= coin) {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}
