package LEC29;
public class Adjencency_Matrix {
    public static void main(String[] args) {
        int v=4;
        int Matrix[][]=new int[v][v];
        AddEdge(Matrix,0,1);
        AddEdge(Matrix,0,3);
        AddEdge(Matrix,2,3);
        AddEdge(Matrix,0,2);
        Display(Matrix);
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
