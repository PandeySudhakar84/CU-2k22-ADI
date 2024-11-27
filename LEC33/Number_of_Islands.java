package LEC33;

public class Number_of_Islands {
    class Solution {
        public int numIslands(char[][] grid) {
            int count=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]=='1'){
                        DFS(grid,i,j);
                        count++;
                    }
                }
            }
            return count;
        }
        public void DFS(char grid[][],int i,int j){
            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
                return;
            }
            if(grid[i][j]=='0' || grid[i][j]=='5'){
                return;
            }
            grid[i][j]='5';
            DFS(grid,i-1,j);
            DFS(grid,i,j-1);
            DFS(grid,i+1,j);
            DFS(grid,i,j+1);
        }
    }
}
