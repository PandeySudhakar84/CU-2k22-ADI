import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();// row
        int n=sc.nextInt();// col
        int Maze[][]=new int[m][n];
        for(int i=0;i<Maze.length;i++){
            String s=sc.next();
            for(int j=0;j<Maze[0].length;j++){
              Maze[i][j]=s.charAt(j);
            }
        }
        int ans[][]=new int[m][n];
        PrintPath(Maze,0,0,ans);
        if(flag==0){
            System.out.println("NO PATH FOUND");
        }
    }
    static int flag=0;
    public static void PrintPath(int Maze[][],int cr,int cc,int ans[][]){
        if(cc<0 || cr<0 || cc>Maze[0].length-1 || cr>Maze.length-1 || Maze[cr][cc]=='X'){
            return;
        }
        if(cc==Maze[0].length-1 && cr==Maze.length-1){
            ans[cr][cc]=1;
            flag=1;
            Display(ans);
            return;
        }
        Maze[cr][cc]='X';
        ans[cr][cc]=1;
        int r[]={-1,0,1,0};
        int c[]={0,-1,0,1};
        for(int i=0;i<r.length;i++){
            PrintPath(Maze,cr+r[i],cc+c[i],ans);
        }
//        PrintPath(Maze,cr-1,cc,ans); //up
//        PrintPath(Maze,cr,cc-1,ans); // left
//        PrintPath(Maze,cr+1,cc,ans);  // down
//        PrintPath(Maze,cr,cc+1,ans);  // right

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
