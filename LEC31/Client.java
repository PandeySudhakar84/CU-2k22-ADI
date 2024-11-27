package LEC31;
public class Client {
    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.AddEdge(1,4,5);
        g.AddEdge(1,2,3);
        g.AddEdge(2,3,5);
        g.AddEdge(3,4,8);
        g.AddEdge(4,5,6);
        g.AddEdge(5,6,7);
        g.AddEdge(6,7,10);
        g.AddEdge(5,7,12);
        g.Diplay();
        System.out.println("***************");
        g.RemoveEdge(6,7);
        g.Diplay();
        System.out.println(g.IsContainsEdge(1,2));
        g.AddVertex(8);
        System.out.println(g.NoOfEdge());
        System.out.println(g.BFS(1,6));

    }
}
