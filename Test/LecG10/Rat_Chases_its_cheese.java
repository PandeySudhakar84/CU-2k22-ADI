package Test.LecG10;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int Maze[][]=new int[n][m];
        for(int i=0;i<Maze.length;i++){
            String s=sc.next();
            for(int j=0;j<Maze[0].length;j++){
                Maze[i][j]=s.charAt(j);
            }
        }
        int ans[][]=new int[n][m];
        MazePath(0,0,Maze,ans);
        if(flag==0){
            System.out.println("NO PATH FOUND");
        }
    }
    static int flag=0;
    public static void MazePath(int cr,int cc,int Maze[][],int ans[][]){
        if(cc<0 || cr<0 || cc>Maze[0].length-1 || cr>Maze.length-1 || Maze[cr][cc]=='X'){
            return;
        }
        if(cr==Maze.length-1 && cc==Maze[0].length-1){
            flag=1;
            ans[cr][cc]=1;
            Display(ans);
            return;
        }
        Maze[cr][cc]='X';
        ans[cr][cc]=1;
        int r[]={-1,0,1,0};
        int c[]={0,-1,0,1};
        for(int i=0;i<c.length;i++){
            MazePath(cr+r[i],cc+c[i],Maze,ans);
        }
//        MazePath(cr-1,cc,Maze,ans);//up
//        MazePath(cr,cc-1,Maze,ans);//left
//        MazePath(cr+1,cc,Maze,ans);// down
//        MazePath(cr,cc+1,Maze,ans);//right
        Maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void Display(int ans[][]){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
