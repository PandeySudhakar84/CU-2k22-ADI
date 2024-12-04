package Lec39;
public class Floyd_Warshall {
    class Solution {
        public void shortestDistance(int[][] mat) {
            // Code here
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]==-1){
                        mat[i][j]=Integer.MAX_VALUE;
                    }
                }
            }
            for(int k=0;k<mat.length;k++){
                for(int i=0;i<mat.length;i++){
                    for(int j=0;j<mat[0].length;j++){
                        if(mat[i][k]!=Integer.MAX_VALUE && mat[k][j]!=Integer.MAX_VALUE){
                            mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
                        }
                    }
                }
            }
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]==Integer.MAX_VALUE){
                        mat[i][j]=-1;
                    }
                }
            }
        }
    }
}
