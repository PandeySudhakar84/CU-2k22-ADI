package LEC34;

import java.util.*;

public class Number_of_Provinces {
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int n= isConnected.length;
            HashMap<Integer, List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(i,new ArrayList<>());
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(isConnected[i][j]==1 && i!=j){
                        map.get(i).add(j);
                        map.get(j).add(i);
                    }
                }
            }
            int count=0;
            HashSet<Integer> visited=new HashSet<>();
            for(int key:map.keySet()){
                if(!visited.contains(key)){
                    BFS(map,key,visited);
                    count++;
                }
            }
            return count;
        }
        public static void BFS(HashMap<Integer,List<Integer>>map,int key,HashSet<Integer> visited){
            Queue<Integer> q=new LinkedList<>();
            q.add(key);
            while(!q.isEmpty()){
                // remove
                int rv=q.poll();
                // ignore
                if(visited.contains(rv)){
                    continue;
                }
                // visited
                visited.add(rv);

                //self work

                // add unvisited
                for(int nbrs:map.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
    }
}
