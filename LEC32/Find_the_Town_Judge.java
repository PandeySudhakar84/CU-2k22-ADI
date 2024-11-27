package LEC32;

public class Find_the_Town_Judge {
    class Solution {
        public int findJudge(int n, int[][] trust) {
            int indeg[]=new int[n+1];
            int outdeg[]=new int[n+1];
            for(int a[]:trust){
                outdeg[a[0]]++;
                indeg[a[1]]++;
            }
            for(int i=1;i<=n;i++){
                if(indeg[i]==n-1 && outdeg[i]==0){
                    return i;
                }
            }
            return -1;
        }
    }
}
