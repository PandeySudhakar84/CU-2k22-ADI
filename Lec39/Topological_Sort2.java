package Lec39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort2 {

    class Solution {
        static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
            int V = adj.size(); // Number of vertices
            int[] inDegree = new int[V];

            for (int i = 0; i < V; i++) {
                for (int node : adj.get(i)) {
                    inDegree[node]++;
                }
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < V; i++) {
                if (inDegree[i] == 0) {
                    q.add(i);
                }
            }

            ArrayList<Integer> topologicalOrder = new ArrayList<>();

            while (!q.isEmpty()) {
                int vertex = q.poll();
                topologicalOrder.add(vertex);

                for (int neighbor : adj.get(vertex)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }

            return topologicalOrder;
        }
    }

}
