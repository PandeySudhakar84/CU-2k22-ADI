package Lec39;
import java.util.*;
public class Course_Schedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] pair : prerequisites) {
                adj.get(pair[1]).add(pair[0]);
            }
            return isPossible(numCourses, adj);
        }
        private boolean isPossible(int numCourses, ArrayList<ArrayList<Integer>> adj) {
            int[] inDegree = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                for (int node : adj.get(i)) {
                    inDegree[node]++;
                }
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (inDegree[i] == 0) {
                    q.add(i);
                }
            }
            int count = 0;
            while (!q.isEmpty()) {
                int vertex = q.poll();
                count++;
                for (int neighbor : adj.get(vertex)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
            return count == numCourses;
        }
    }
}
