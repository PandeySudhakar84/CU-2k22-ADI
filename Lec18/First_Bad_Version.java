package Lec18;
    public class First_Bad_Version {
            public int firstBadVersion(int n) {
                int low=1;
                int high=n;
                int ans=0;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(isBadVersion(mid)){
                        ans=mid;
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
                return ans;
            }
            // is BasdVersion method alrady was given on leetcode you only need to call it
            public static boolean isBadVersion(int mid){
                return true;
        }
}
