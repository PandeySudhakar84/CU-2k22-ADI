package LEC24;

public class Subset_Sum_Problem {
// User function Template for Java
    class Solution {
        static Boolean isSubsetSum(int arr[], int sum) {
            // code here
            Boolean dp[][]=new Boolean[arr.length+1][sum+1];
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
            boolean Not_pick=false;
            if(sum>=arr[i]){
                pick= SubSet(arr,sum-arr[i],i+1,dp);
            }
            Not_pick=SubSet(arr,sum,i+1,dp);
            return dp[i][sum]=pick || Not_pick;
        }
    }
}
