package LEC23;
public class Longest_Increasing_Subsequence_Optimize {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            return LIS(nums);
        }
        public static int LIS(int nums[]){
            int ans[]=new int[nums.length];
            ans[0]=nums[0];
            int length=1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>ans[length-1]){
                    ans[length]=nums[i];
                    length++;
                }
                else{
                    int index=BinarySearch(ans,0,length-1,nums[i]);
                    ans[index]=nums[i];
                }
            }
            return length;
        }
        public static int BinarySearch(int ans[],int si,int ei,int target){
            int index=0;
            while(si<=ei){
                int mid=(si+ei)/2;
                if(ans[mid]>=target){
                    index=mid;
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
            return index;
        }
    }
}
