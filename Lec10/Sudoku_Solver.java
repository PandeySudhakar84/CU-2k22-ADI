package Lec10;
public class Sudoku_Solver {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        Solve(grid,0,0);
    }
    public static void Solve(int grid[][],int row,int col){
        if(col==9){
            col=0;
            row++;
        }
        if(row==9){
            Display(grid);
            return;
        }
        if(grid[row][col]!=0){
            Solve(grid, row, col+1);
        }
        else {
            for(int ele=1;ele<=9;ele++){
                if(IsItSafe(grid,row,col,ele)==true){
                    grid[row][col]=ele;
                    Solve(grid, row, col+1);
                    grid[row][col]=0;
                }
            }
        }
    }
    public static boolean IsItSafe(int grid[][],int row,int col,int ele){
        //col
       for(int i=0;i<9;i++){
           if(grid[i][col]==ele){
               return false;
           }
       }
       // row
        for(int i=0;i<9;i++){
            if(grid[row][i]==ele){
                return false;
            }
        }
        // 3*3 Matrix
        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(grid[i][j]==ele){
                    return false;
                }
            }
        }
        return true;
    }
    public static void Display(int grid[][]){
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
