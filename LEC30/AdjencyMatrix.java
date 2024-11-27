package LEC30;
public class AdjencyMatrix {
    public static void main(String[] args) {
        int v=4;
        int Matrix[][]=new int[v][v];
        AddEdge(Matrix,0,1);
        AddEdge(Matrix,0,3);
        AddEdge(Matrix,1,2);
        AddEdge(Matrix,2,3);
    }
    public static void AddEdge(int Matrix[][],int i,int j){
        Matrix[i][j]=1;
        Matrix[j][i]=1;
    }
    public static void Display(int Matrix[][]){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
