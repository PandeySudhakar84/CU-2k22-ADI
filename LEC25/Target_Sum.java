package LEC25;

public class Target_Sum {
    class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int s = 0;
            int n = nums.length;
            for(int num : nums) s += num;
            target += s;
            if(target < 0 || target % 2 != 0) return 0;
            target /= 2;

            int[] dp = new int[target+1]; // flatten to one dimension
            dp[0] = 1;
            for(int i = 0; i < n; ++i){
                for(int c = target; c >= 0; --c){
                    if(c >= nums[i]){
                        dp[c] = dp[c] + dp[c-nums[i]];
                    }
                }
            }
            return dp[target];
        }

    }
}
