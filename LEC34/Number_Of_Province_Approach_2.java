package LEC34;

public class Number_Of_Province_Approach_2 {
    class Solution {
        int n;
        public int findCircleNum(int[][] isConnected) {
            int count = 0;
            n = isConnected.length;
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    dfs(isConnected, visited, i);
                    count++;
                }
            }
            return count;
        }
        public void dfs(int[][] isConnected, boolean[] visited, int i) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    dfs(isConnected, visited, j);
                }
            }
        }
    }
}
