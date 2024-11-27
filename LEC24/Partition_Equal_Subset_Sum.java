package LEC24;
public class Partition_Equal_Subset_Sum {
    class Solution {
        public boolean canPartition(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
            }
            if(sum%2!=0){
                return false;
            }
            return Partition(nums,sum/2);
        }
        public static boolean Partition(int arr[],int sum){
            Boolean dp[][]=new Boolean[arr.length][sum+1];
            return SubSet(arr,sum,0,dp);
        }
        public static boolean SubSet(int arr[],int sum,int i,Boolean dp[][]){
            if(sum==0){
                return true;
            }
            if(i==arr.length){
                return false;
            }
            if(dp[i][sum]!=null){
                return dp[i][sum];
            }
            boolean pick=false;
            boolean Dont_pick=false;
            if(sum>=arr[i]){
                pick=SubSet(arr,sum-arr[i],i+1,dp);
            }
            Dont_pick=SubSet(arr,sum,i+1,dp);
            return dp[i][sum]=pick || Dont_pick;
        }
    }
}
