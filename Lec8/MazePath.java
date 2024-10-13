package Lec8;

public class MazePath {
    public static void main(String[] args) {
        int m=3;// row
        int n=3; // col;
        int Maze[][]=new int[m][n];
        Path(Maze,0,0,m-1,n-1,"");
    }
    public static void Path(int Maze[][],int cr,int cc,int er,int ec,String ans){
        if(cc>ec || cr>er){
            return;
        }
        if(cc==ec && cr==er){
            System.out.println(ans);
            return;
        }
        Path(Maze,cr,cc+1,er,ec,ans+"H");
        Path(Maze,cr+1,cc,er,ec,ans+"V");
    }
}
