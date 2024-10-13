package Test.LecG10;
public class MazePath {
    public static void main(String[] args) {
      int m=3;
      int n=3;
      Maze(0,0,m-1,n-1,"");
    }
    public static void Maze(int curCol,int curRow,int endCol,int endRow,String ans){
        if(curCol==endCol && curRow==endRow){
            System.out.println(ans);
            return;
        }
        if(curCol>endCol || curRow>endRow){
            return;
        }
        Maze(curCol+1,curRow,endCol,endRow,ans+"H");
        Maze(curCol,curRow+1,endCol,endRow,ans+"V");
    }
}
