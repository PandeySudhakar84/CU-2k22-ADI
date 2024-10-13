package Test.LecG10;

import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        String  board[][]=new String[n][n];
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i],".");
        }
        Queen(n,board,0);
    }
    public static void Queen(int tq,String  board[][],int row){
        if(tq==0){
            Display(board);
            return;
        }
        for(int col=0;col<board[0].length;col++){
           if(IsSafe(board,row,col)){
               board[row][col]="Q";
               Queen(tq-1,board,row+1);
               board[row][col]=".";
           }
        }
    }
    public static boolean IsSafe(String  board[][],int row,int col){
        int r=row;
        while (r>=0){
            if(board[r][col]=="Q"){
                return false;
            }
            r--;
        }
         r=row;
        int c=col;
        while (c>=0 && r>=0){
            if(board[r][c]=="Q"){
                return false;
            }
            c--;
            r--;
        }
        r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]=="Q"){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public static void Display(String bord[][]){
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord[0].length;j++){
                System.out.print(bord[i][j]+" ");
            }
            System.out.println();
        }
    }
}
