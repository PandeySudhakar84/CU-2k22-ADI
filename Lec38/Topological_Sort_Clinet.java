package Lec38;

import java.util.Arrays;

public class Topological_Sort_Clinet {
    public static void main(String[] args) {
        Topological_Sort t = new Topological_Sort(7);
        t.addEdge(1, 2);
        //t.addEdge(2, 1);
        t.addEdge(1, 4);
        t.addEdge(2, 3);
        t.addEdge(3, 6);
        t.addEdge(1, 2);
        t.addEdge(4, 3);
        System.out.println(Arrays.toString(t.indegree()));
        t.TopologicalSort();
        System.out.println(t.IsCycle());

    }

}